package com.cloudtech.snapbizz.snaporder.datamigration.services.implementation;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.MysqlProductStores;
import com.cloudtech.snapbizz.snaporder.datamigration.mysql.repository.MysqlProductStoresRepository;
import com.cloudtech.snapbizz.snaporder.datamigration.services.MysqlProductStoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 10/Feb/2021
 */
@Service
public class MysqlProductStoresServiceImpl implements MysqlProductStoresService {

    @Autowired
    private MysqlProductStoresRepository mysqlProductStoresRepository;

    @Override
    public List<MysqlProductStores> findByStoreId(Long storeId) {

        return mysqlProductStoresRepository.findByStoreId(storeId);
    }

    @Override
    public List<MysqlProductStores> findByProductId(Long productId) {

        return mysqlProductStoresRepository.findByProductId(productId);
    }
}
