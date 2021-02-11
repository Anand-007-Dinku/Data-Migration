package com.cloudtech.snapbizz.snaporder.datamigration.services;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.MysqlProductStores;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 10/Feb/2021
 */
public interface MysqlProductStoresService {

    public List<MysqlProductStores> findByStoreId(Long storeId);

    public List<MysqlProductStores> findByProductId(Long productId);

}
