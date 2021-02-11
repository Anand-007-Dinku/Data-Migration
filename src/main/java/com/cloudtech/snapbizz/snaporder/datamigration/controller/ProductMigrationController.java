package com.cloudtech.snapbizz.snaporder.datamigration.controller;

import com.cloudtech.snapbizz.snaporder.datamigration.migration.ProductsMigration;
import com.cloudtech.snapbizz.snaporder.datamigration.migration.StoresMigration;
import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.MappingStoreId;
import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.repository.MappingStoreIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Anand SN
 * Created date : 10/Feb/2021
 */

@RestController
@RequestMapping("/migrate")
public class ProductMigrationController {

    @Autowired
    ProductsMigration productsMigration;

    @Autowired
    StoresMigration storesMigration;

    @Autowired
    MappingStoreIdRepository mappingStoreIdRepository;

 /*  @PostMapping("/stores")
    public Boolean migrateStores(){
        Boolean bool = false;
        bool = storesMigration.migrateData();
        return bool;
    }*/

    @PostMapping("/products/{storeId}")
    public Boolean migrateProductsByStoreId(@PathVariable("storeId") Long storeId){

        Boolean bool = false;

        Boolean isValidStore = productsMigration.checkStoreIdAvailable(storeId);
        Boolean isAlreadyMigrated =productsMigration.checkAlreadyMigrated(storeId);

        if (isValidStore){
            if (isAlreadyMigrated){
                bool = productsMigration.migrateProductsByStoreId(storeId);
            } else {
                System.out.println("This Store Products is Already Migrated \n STORE ID : "+storeId);
            }
        } else {
            System.out.println("Store Not listed into Registered Store table \n STORE ID : "+storeId);
        }

        return bool;
    }

    @PostMapping("/products")
    public Boolean migrateProducts(){

        AtomicReference<Boolean> bool = new AtomicReference<>(false);

        List<MappingStoreId> mappingStoreIdList =mappingStoreIdRepository.findAll();

        mappingStoreIdList.stream().forEach(mappingStoreId -> {

            Boolean isValidStore = productsMigration.checkStoreIdAvailable(mappingStoreId.getOldStoreId());
            Boolean isAlreadyMigrated =productsMigration.checkAlreadyMigrated(mappingStoreId.getOldStoreId());

            if (isValidStore){
                if (isAlreadyMigrated){
                    bool.set(productsMigration.migrateProductsByStoreId(mappingStoreId.getOldStoreId()));
                } else {
                    System.out.println("This Store Products is Already Migrated \n STORE ID : "+mappingStoreId.getOldStoreId());
                }
            } else {
                System.out.println("Store Not listed into Registered Store table \n STORE ID : "+mappingStoreId.getOldStoreId());
            }



        });
        return bool.get();
    }

    /* @PostMapping("/products-data")
    public Boolean migrateProducts() {
       Boolean bool = false;
       bool = migrateDataService.migrateProducts();

       return bool;
   }*/

}
