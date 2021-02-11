package com.cloudtech.snapbizz.snaporder.datamigration.services;

import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.Products;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 09/Feb/2021
 */
public interface ProductService {

    public List<Products> getAllProducts();

    public List<Products> getProductsByStoreId(Long storeId);

    public Products save(Products products);

    Products findByBarcodeAndStoreid(String barcode,Long storeId );

    public List<Products> saveAll(List<Products> products);

}
