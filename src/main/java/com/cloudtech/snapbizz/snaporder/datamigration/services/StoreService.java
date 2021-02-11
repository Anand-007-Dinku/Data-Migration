package com.cloudtech.snapbizz.snaporder.datamigration.services;

import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.Stores;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 08/Feb/2021
 */
public interface StoreService {

    public List<Stores> getAllStores();

    public Stores getStoreByStoreId(Long id);

    public Stores save(Stores stores);
}
