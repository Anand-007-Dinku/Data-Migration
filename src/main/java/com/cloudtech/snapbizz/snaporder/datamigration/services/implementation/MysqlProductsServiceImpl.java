package com.cloudtech.snapbizz.snaporder.datamigration.services.implementation;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.MysqlProductStores;
import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.MysqlProducts;
import com.cloudtech.snapbizz.snaporder.datamigration.mysql.repository.MysqlProductsRepository;
import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.MappingStoreId;
import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.Products;
import com.cloudtech.snapbizz.snaporder.datamigration.services.MappingStoreIdService;
import com.cloudtech.snapbizz.snaporder.datamigration.services.MysqlProductStoresService;
import com.cloudtech.snapbizz.snaporder.datamigration.services.MysqlProductsService;
import com.cloudtech.snapbizz.snaporder.datamigration.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * @author Anand SN
 * Created date : 10/Feb/2021
 */

@Service
public class MysqlProductsServiceImpl implements MysqlProductsService {

    @Autowired
    private MysqlProductsRepository mysqlProductsRepository;


    @Override
    public List<MysqlProducts> findAll() {
        return mysqlProductsRepository.findAll();
    }


    @Override
    public MysqlProducts findByProductId(Long id) {
        return mysqlProductsRepository.findByProductId(id);
    }
}
