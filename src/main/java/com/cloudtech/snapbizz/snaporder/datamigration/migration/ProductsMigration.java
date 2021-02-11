package com.cloudtech.snapbizz.snaporder.datamigration.migration;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.MysqlProductStores;
import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.MysqlProducts;
import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.RegisteredStores;
import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.MappingStoreId;
import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.Products;
import com.cloudtech.snapbizz.snaporder.datamigration.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * @author Anand SN
 * Created date : 10/Feb/2021
 */

@Component
public class ProductsMigration {

    @Autowired
    private ProductService productsService;

    @Autowired
    private MysqlProductStoresService mysqlProductStoresService;

    @Autowired
    private MappingStoreIdService mappingStoreIdService;

    @Autowired
    private ProductService productService;

    @Autowired
    private MysqlProductsService mysqlProductsService;

    @Autowired
    private RegisteredStoreService registeredStoreService;

    public Boolean checkStoreIdAvailable(Long storeId){

        Boolean bool = false;

        RegisteredStores registeredStores = registeredStoreService.getRegisteredStoresById(storeId);

        if (null != registeredStores){
            bool = true;
        } else {
            System.out.println("Store Not listed into Registered Store table : ");
        }

        return bool;
    }

    public Boolean checkAlreadyMigrated(Long storeId) {
        Boolean bool = false;

       MappingStoreId mappingStoreId =  mappingStoreIdService.findByOldStoreId(storeId);
       if (mappingStoreId.getMigrated()==Boolean.FALSE){
           bool = true;
       } else {
           System.out.println("Products Belongs to this StoreId already Migrated");
       }

        return bool;
    }

    public Boolean migrateProductsByStoreId(Long storeId) {
        AtomicReference<Boolean> bool = new AtomicReference<>(false);

        List<Products> productsList = new LinkedList<>();

        AtomicReference<MappingStoreId> mappingStoreId = new AtomicReference<>();

        List<MysqlProductStores> mysqlProductStoresList = mysqlProductStoresService.findByStoreId(storeId);

        List<Long> productIdList = mysqlProductStoresList.stream().map(productStoresList -> productStoresList.getProductId()).collect(Collectors.toList());

        List<MysqlProducts> mysqlProductsList = productIdList.stream().map(id ->mysqlProductsService.findByProductId(id)).collect(Collectors.toList());

        mysqlProductsList.stream().forEach(mysqlProducts -> {

            if (null != mysqlProducts){
                Products products = new Products();

                if (null != mysqlProducts.getBARCODE())
                    products.setBarcode(mysqlProducts.getBARCODE());

                if (null != mysqlProducts.getPRODUCTNAME())
                    products.setTitle(mysqlProducts.getPRODUCTNAME());

                if (null != mysqlProducts.getPRODUCTDESCRIPTION())
                    products.setDescription(mysqlProducts.getPRODUCTDESCRIPTION());

                if (null != mysqlProducts.getImageUrl())
                    products.setImg_url(mysqlProducts.getImageUrl());

                if (null != mysqlProducts.getCreated_date())
                    products.setCreated_at(mysqlProducts.getCreated_date());

                if (null != mysqlProducts.getModifeid_date())
                    products.setUpdated_at(mysqlProducts.getModifeid_date());

//          products.setTsv(oldPd.get);
                products.setArticle_id("0");
                products.setIs_deleted(Boolean.FALSE);
                products.setIs_gdb(Boolean.FALSE);
                products.setSubcategory_id(0);
                products.setIs_active(Boolean.TRUE);


                Long oldProductId = mysqlProducts.getProductId();

                List<MysqlProductStores> mysqlProductStores = mysqlProductStoresService.findByProductId(oldProductId).stream()
                        .filter(stores -> stores.getPRODUCTUNIT() != "1 GM" || stores.getPRODUCTUNIT() != "1 ML"
                                || stores.getPRODUCTUNIT() != "GM" || stores.getPRODUCTUNIT() != "ML").collect(Collectors.toList());

                if (null != mysqlProductStores && mysqlProductStores.size() == 1) {


                    if (null != mysqlProductStores.get(0).getPRODUCTUNIT())
                        products.setUnit(mysqlProductStores.get(0).getPRODUCTUNIT());

                    if (null != mysqlProductStores.get(0).getStore_mrp_price())
                        products.setMrp(mysqlProductStores.get(0).getStore_mrp_price());

                    if (null != mysqlProductStores.get(0).getPrice())
                        products.setSell_price(mysqlProductStores.get(0).getPrice());


                    /*Here We are generating new storeId's while creating stores,
                     * and storing the old storeId's in the MappingStoreId table.
                     *
                     * Hence we are sending old StoreId's from the mysqlProductStores to
                     * get new generated storeId and saving in the Products table
                     * */

                    mappingStoreId.set(mappingStoreIdService.findByOldStoreId(mysqlProductStores.get(0).getStoreId()));
                    products.setStoreid(mappingStoreId.get().getNewStoreId());

                    //Checking Duplicate Products By Barcode

                    Products duplicateProducts = productsService.findByBarcodeAndStoreid(products.getBarcode(),products.getStoreid());
                    if(null == duplicateProducts)
                        productsList.add(products);
                    else
                        System.out.println("*********************************Duplicate Product found \n product id is : "+ duplicateProducts.getId()+" and Store id is:  "+duplicateProducts.getStoreid());

                    if (productsList.size() == 50){
                        saveMigratedData(mappingStoreId.get());
                        productService.saveAll(productsList);
                        System.out.println("Saved Products : "+productIdList.size());
                        productsList.clear();
                        bool.set(true);
                    }
                }
            } else {
                System.out.println("Product contains Null value");
            }

        });

        if (productsList.size()>0){
            saveMigratedData(mappingStoreId.get());
            productService.saveAll(productsList);
            System.out.println("Saved Products : "+productIdList.size());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~Completed Moving Products for Store id " +productsList.get(0).getStoreid()+"~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            productsList.clear();
            bool.set(true);
        }

        return bool.get();
    }


    public MappingStoreId saveMigratedData(MappingStoreId mappingStoreId){
        mappingStoreId.setMigrated(Boolean.TRUE);
        return mappingStoreIdService.save(mappingStoreId);
    }


 /*   @Override
    public List<Employee> findByName(String name, int offset, int limit) {
        // limit != 0 ;)
        int page = offset / limit;
        return repository.findByName(name, new PageRequest(page, limit));
    }*/


  /*
        @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public Boolean migrateProducts() {

        Boolean bool = false;

        LinkedList<Products> productsList = new LinkedList<>();

        List<MysqlProducts> productsStream = mysqlProductsService.findAll();

        productsStream.forEach(oldPd -> {

            Products products = new Products();

            if (null != oldPd.getBARCODE())
                products.setBarcode(oldPd.getBARCODE());

            if (null != oldPd.getPRODUCTNAME())
                products.setTitle(oldPd.getPRODUCTNAME());

            if (null != oldPd.getPRODUCTDESCRIPTION())
                products.setDescription(oldPd.getPRODUCTDESCRIPTION());

            if (null != oldPd.getImageUrl())
                products.setImg_url(oldPd.getImageUrl());

            if (null != oldPd.getCreated_date())
                products.setCreated_at(oldPd.getCreated_date());

            if (null != oldPd.getModifeid_date())
                products.setUpdated_at(oldPd.getModifeid_date());

//          products.setTsv(oldPd.get);
            products.setArticle_id("0");
            products.setIs_deleted(false);
            products.setIs_gdb(false);
            products.setSubcategory_id(0);
            products.setIs_active(true);

            Long oldProductId = oldPd.getProductId();

            MysqlProductStores mysqlProductStores = mysqlProductStoresRepository.findByProductId(oldProductId);

            if(null != mysqlProductStores) {

                if(null != mysqlProductStores.getPRODUCTUNIT())
                    products.setUnit(mysqlProductStores.getPRODUCTUNIT());

                if(null != mysqlProductStores.getStore_mrp_price())
                    products.setMrp(mysqlProductStores.getStore_mrp_price());

                if(null != mysqlProductStores.getPrice())
                    products.setSell_price(mysqlProductStores.getPrice());



                Here We are generating new storeId's while creating stores,
     * and storing the old storeId's in the MappingStoreId table.
     *
     * Hence we are sending old StoreId's from the mysqlProductStores to
     * get new generated storeId and saving in the Products table
     *

                MappingStoreId mappingStoreId = mappingStoreIdRepository.findByOldStoreId(mysqlProductStores.getStoreId());
                products.setStoreid(mappingStoreId.getNewStoreId());
                productsList.add(products);
            }

            if (true){
                productsRepository.saveAll(productsList);
                productsList.clear();
            }
            entityManager.detach(oldPd);
        });

        return true;
    }


    */
}
