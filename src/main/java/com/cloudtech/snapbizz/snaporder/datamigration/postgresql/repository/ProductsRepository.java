package com.cloudtech.snapbizz.snaporder.datamigration.postgresql.repository;

import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 09/Feb/2021
 */

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {
    List<Products> findByStoreid(Long storeId);

    Products findById(Long id);

    Products findByBarcodeAndStoreid(String barcode,Long storeId);
}
