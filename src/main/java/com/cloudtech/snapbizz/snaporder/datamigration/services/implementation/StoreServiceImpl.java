package com.cloudtech.snapbizz.snaporder.datamigration.services.implementation;

import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.Stores;
import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.repository.StoresRepository;
import com.cloudtech.snapbizz.snaporder.datamigration.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 08/Feb/2021
 */

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoresRepository storesRepository;

    @Override
    public List<Stores> getAllStores() {
        return storesRepository.findAll();
    }

    @Override
    public Stores getStoreByStoreId(Long id) {
        return storesRepository.findById(id).get();
    }

    @Override
    public Stores save(Stores stores) {
        return storesRepository.save(stores);
    }
}


