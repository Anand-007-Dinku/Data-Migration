package com.cloudtech.snapbizz.snaporder.datamigration.services;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.MysqlProducts;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 10/Feb/2021
 */
public interface MysqlProductsService {

    public List<MysqlProducts> findAll();

    MysqlProducts findByProductId(Long id);
}
