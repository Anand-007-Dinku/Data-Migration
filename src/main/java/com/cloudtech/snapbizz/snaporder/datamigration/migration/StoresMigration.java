package com.cloudtech.snapbizz.snaporder.datamigration.migration;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.RegisteredStores;
import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.SBSOStoreMap;
import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.MappingStoreId;
import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.Stores;
import com.cloudtech.snapbizz.snaporder.datamigration.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 10/Feb/2021
 */

@Component
public class StoresMigration {

    @Autowired
    private RegisteredStoreService registeredStoreService;

    @Autowired
    private StoreService storeService;

    @Autowired
    private StoreMapService storeMapService;

    @Autowired
    private MappingStoreIdService mappingStoreIdService;

    public Boolean migrateData() {

        Boolean bool = false;

        List<RegisteredStores> allRegisteredStores = registeredStoreService.getAllRegisteredStores();

        for (RegisteredStores registeredStore : allRegisteredStores) {

            if (null != registeredStore){

                Stores stores = new Stores();

                SBSOStoreMap storeMap = storeMapService.getBySostoreid(registeredStore.getStoreId());

                if (null != storeMap){
                    stores.setSbId(storeMap.getSbStoreid());

                    stores.setMetroDcId(storeMap.getMetroDcId());
                }

                stores.setPhone(registeredStore.getMobileNumber());

                stores.setPwd(registeredStore.getPassword());

                stores.setName(registeredStore.getStoreName());

                stores.setStreet(registeredStore.getStreet());

                stores.setCity(registeredStore.getCity());

                stores.setState(registeredStore.getState());

                stores.setCountry(registeredStore.getCountry());

                stores.setPin(registeredStore.getZipcode());

                stores.setLatitude(registeredStore.getLatitude());

                stores.setLongitude(registeredStore.getLongitude());

                stores.setServiceArea(registeredStore.getServiceArea());

                stores.setSubscriptionExpiryDate(registeredStore.getExpiredOn());

                stores.setMinOrderValue(Integer.toString((int) registeredStore.getMinOrderValue()));

                stores.setOwnerName(registeredStore.getProprietorName());

                stores.setWorkingDay(registeredStore.getWorkingDays());

                stores.setWorkingTiming(registeredStore.getWorkTimings());

                stores.setPaymentModes("Cash,Card");

                stores.setCreatedAt(registeredStore.getCreatedDate());

                stores.setUpdatedAt(registeredStore.getModifiedDate());

                storeService.save(stores);

                /*Here We are generating new storeId's while creating stores,
                 * and storing the old storeId's in the MappingStoreId table.
                 */
                MappingStoreId mappingStoreId = new MappingStoreId();
                mappingStoreId.setOldStoreId(registeredStore.getStoreId());
                mappingStoreId.setNewStoreId(stores.getStoreId());
                mappingStoreIdService.save(mappingStoreId);

                bool = true;
            }
        }
        return bool;
    }

}
