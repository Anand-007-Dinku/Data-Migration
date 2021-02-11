package com.cloudtech.snapbizz.snaporder.datamigration.services.implementation;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.SBSOStoreMap;
import com.cloudtech.snapbizz.snaporder.datamigration.mysql.repository.StoreMapRepository;
import com.cloudtech.snapbizz.snaporder.datamigration.services.StoreMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 09/Feb/2021
 */
@Service
public class StoreMapServiceImpl implements StoreMapService {

    @Autowired
    private StoreMapRepository storeMapRepository;

    @Override
    public List<SBSOStoreMap> getAllStores() {
        return storeMapRepository.findAll();
    }

    @Override
    public SBSOStoreMap getById(Integer id) {
        return storeMapRepository.findById(id).get();
    }

    @Override
    public SBSOStoreMap getBySostoreid(Long id) {

        SBSOStoreMap storeMap = storeMapRepository.findBySostoreid(id).orElseGet(() -> {
            SBSOStoreMap map = new SBSOStoreMap();
            map.setIs_active_sync(true);
            map.setMetro_dcid(0);
            map.setSb_storeid(0);
            map.setStore_name("abc");
            map.setSo_storeid(id);
            return map;
        });
        return storeMap;

    }
}
