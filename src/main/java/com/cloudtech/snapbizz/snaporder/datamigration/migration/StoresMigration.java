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

    @Autowired
    private MysqlProductsService mysqlProductsService;

    public Boolean migrateData() {

        Boolean bool = false;

        List<RegisteredStores> allRegisteredStores = registeredStoreService.getAllRegisteredStores();

        for (RegisteredStores registeredStore : allRegisteredStores) {

            Stores stores = new Stores();

            SBSOStoreMap storeMap = storeMapService.getBySostoreid(registeredStore.getStoreId());

            stores.setSb_id(storeMap.getSb_storeid());

            stores.setMetro_dc_id(storeMap.getMetro_dcid());

            stores.setPhone(registeredStore.getMobile_number());

            stores.setPwd(registeredStore.getPassword());

            stores.setName(registeredStore.getSTORENAME());

            stores.setStreet(registeredStore.getStreet());

            stores.setCity(registeredStore.getCITY());

            stores.setState(registeredStore.getSTATE());

            stores.setCountry(registeredStore.getCOUNTRY());

            stores.setPin(registeredStore.getZIPCODE());

            stores.setLatitude(registeredStore.getLAT());

            stores.setLongitude(registeredStore.getLANG());

            stores.setService_area(registeredStore.getService_area());

            stores.setSubscription_expiry_date(registeredStore.getExpired_on());

            stores.setMin_order_value(Integer.toString((int) registeredStore.getMin_order_value()));

            stores.setOwner_name(registeredStore.getProprietor_name());

            stores.setWorking_day(registeredStore.getWorking_days());

            stores.setWorking_timing(registeredStore.getWork_timings());

            stores.setPayment_modes("Cash,Card");

            stores.setCreated_at(registeredStore.getCreated_date());

            stores.setUpdated_at(registeredStore.getModified_date());

            storeService.save(stores);

            /*Here We are generating new storeId's while creating stores,
             * and storing the old storeId's in the MappingStoreId table.
             */
            MappingStoreId mappingStoreId = new MappingStoreId();
            mappingStoreId.setOldStoreId(registeredStore.getStoreId());
            mappingStoreId.setNewStoreId(stores.getStore_id());
            mappingStoreIdService.save(mappingStoreId);

            bool = true;

        }
        return bool;
    }

}
