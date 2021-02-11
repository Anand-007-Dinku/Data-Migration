package com.cloudtech.snapbizz.snaporder.datamigration.services.implementation;

import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.Products;
import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.repository.ProductsRepository;
import com.cloudtech.snapbizz.snaporder.datamigration.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 09/Feb/2021
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    @Override
    public List<Products> getProductsByStoreId(Long storeId) {
        return productsRepository.findByStoreid(storeId);
    }

    @Override
    public Products save(Products products) {
        Products existingProducts = products;

        if (null != existingProducts.getId())
            existingProducts = productsRepository.findById(existingProducts.getId());

        if (null != existingProducts)
            return existingProducts;

        return productsRepository.save(products);
    }

    @Override
    public Products findByBarcodeAndStoreid(String barcode,Long storeId) {
        return productsRepository.findByBarcodeAndStoreid(barcode,storeId);
    }

    public List<Products> saveAll(List<Products> products){
        return productsRepository.saveAll(products);
    }
}
