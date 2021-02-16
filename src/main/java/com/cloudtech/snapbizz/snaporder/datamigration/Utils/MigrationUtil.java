package com.cloudtech.snapbizz.snaporder.datamigration.Utils;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.RegisteredStores;
import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.MappingStoreId;
import com.cloudtech.snapbizz.snaporder.datamigration.services.MappingStoreIdService;
import com.cloudtech.snapbizz.snaporder.datamigration.services.RegisteredStoreService;
import com.google.common.base.Joiner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anand SN
 * Created date : 12/Feb/2021
 */

@Component
public class MigrationUtil {

    @Autowired
    private RegisteredStoreService registeredStoreService;

    @Autowired
    private MappingStoreIdService mappingStoreIdService;

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


    public String toTsVector(String tsv){
        if (null != tsv){

            Map<String,Integer> tsvMap = new HashMap<>();
            List<String> tsVector = Arrays.asList(tsv.split(" "));

            for (int i =0; i< tsVector.size(); i++){
                if (tsVector.get(i).length()>1)
                    tsvMap.put(tsVector.get(i),i+1);
            }

            return Joiner.on(",").withKeyValueSeparator(":").join(tsvMap);
        }
        return "";
    }

}
