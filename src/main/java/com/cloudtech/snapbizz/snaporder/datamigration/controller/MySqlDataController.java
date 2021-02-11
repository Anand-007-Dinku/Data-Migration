package com.cloudtech.snapbizz.snaporder.datamigration.controller;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.RegisteredStores;
import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.SBSOStoreMap;
import com.cloudtech.snapbizz.snaporder.datamigration.mysql.repository.MysqlProductStoresRepository;
import com.cloudtech.snapbizz.snaporder.datamigration.mysql.repository.MysqlProductsRepository;
import com.cloudtech.snapbizz.snaporder.datamigration.mysql.repository.RegisterdStoresRepository;
import com.cloudtech.snapbizz.snaporder.datamigration.mysql.repository.StoreMapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 08/Feb/2021
 */
@RestController
@RequestMapping("/mysql")
public class MySqlDataController {

    @Autowired
    private RegisterdStoresRepository registerdStoresRepository;

    @Autowired
    private StoreMapRepository storeMapRepository;

    @Autowired
    private MysqlProductsRepository mysqlProductsRepository;

    @Autowired
    private MysqlProductStoresRepository storesRepository;

    @GetMapping("/stores")
    public List<RegisteredStores> getStores(){
        return registerdStoresRepository.findAll();
    }

    @GetMapping("/sb_so/stores")
    public List<SBSOStoreMap> getStoreMap(){
        return storeMapRepository.findAll();
    }

    //Stack Overflow Because of Large Number of Products
/*    @GetMapping("/products")
    public List<MysqlProducts> getProducts(){
        return mysqlProductsRepository.findAll();
    }
    @GetMapping("/product/stores")
    public List<MysqlProductStores> getProductStores() {return storesRepository.findAll(); }*/

}
