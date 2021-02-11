package com.cloudtech.snapbizz.snaporder.datamigration.services;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.RegisteredStores;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 08/Feb/2021
 */
public interface RegisteredStoreService {

    public List<RegisteredStores> getAllRegisteredStores();

    public RegisteredStores getRegisteredStoresById(Long id);

}
