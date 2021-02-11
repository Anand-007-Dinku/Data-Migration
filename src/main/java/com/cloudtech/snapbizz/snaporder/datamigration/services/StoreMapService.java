package com.cloudtech.snapbizz.snaporder.datamigration.services;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.SBSOStoreMap;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 09/Feb/2021
 */
public interface StoreMapService {

    public List<SBSOStoreMap> getAllStores();

    public SBSOStoreMap getById(Integer id);

    public SBSOStoreMap getBySostoreid(Long id);

}
