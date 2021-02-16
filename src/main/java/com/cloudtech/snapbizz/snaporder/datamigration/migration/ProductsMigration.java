package com.cloudtech.snapbizz.snaporder.datamigration.migration;

import com.cloudtech.snapbizz.snaporder.datamigration.Utils.MigrationUtil;
import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.MysqlProductStores;
import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.MysqlProducts;
import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.MappingStoreId;
import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.Products;
import com.cloudtech.snapbizz.snaporder.datamigration.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
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
    private MigrationUtil migrationUtil;

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

                if (null != mysqlProducts.getBarcode())
                    products.setBarcode(mysqlProducts.getBarcode());

                if (null != mysqlProducts.getProductName()) {
                    products.setTitle(mysqlProducts.getProductName());
                    products.setTsv(migrationUtil.toTsVector(mysqlProducts.getProductName()));
                }

                if (null != mysqlProducts.getProductDescription())
                    products.setDescription(mysqlProducts.getProductDescription());

                if (null != mysqlProducts.getImageUrl())
                    products.setImgUrl(mysqlProducts.getImageUrl());

                if (null != mysqlProducts.getCreatedDate())
                    products.setCreatedAt(mysqlProducts.getCreatedDate());

                if (null != mysqlProducts.getModifeidDate())
                    products.setUpdatedAt(mysqlProducts.getModifeidDate());

                products.setArticleId("0");
                products.setDeleted(Boolean.FALSE);
                products.setGdb(Boolean.FALSE);
                products.setSubcategoryId(0);
                products.setActive(Boolean.TRUE);


                Long oldProductId = mysqlProducts.getProductId();

                List<MysqlProductStores> mysqlProductStores = mysqlProductStoresService.findByProductId(oldProductId).stream()
                        .filter(stores -> stores.getProductUnit() != "1 GM" || stores.getProductUnit() != "1 ML"
                                || stores.getProductUnit() != "GM" || stores.getProductUnit() != "ML").collect(Collectors.toList());

                if (null != mysqlProductStores && mysqlProductStores.size() == 1) {


                    if (null != mysqlProductStores.get(0).getProductUnit())
                        products.setUnit(mysqlProductStores.get(0).getProductUnit());

                    if (null != mysqlProductStores.get(0).getStoreMrpPrice())
                        products.setMrp(mysqlProductStores.get(0).getStoreMrpPrice());

                    if (null != mysqlProductStores.get(0).getPrice())
                        products.setSellPrice(mysqlProductStores.get(0).getPrice());


                    /* Here We are generating new storeId's while creating stores,
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

                    if (productsList.size() == 500){
                        saveMigratedData(mappingStoreId.get());
                        productService.saveAll(productsList);
                        System.out.println("Saved Products : "+productsList.size());
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
            System.out.println("Saved Products : "+productsList.size());
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
}
