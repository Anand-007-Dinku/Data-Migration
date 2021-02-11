package com.cloudtech.snapbizz.snaporder.datamigration.mysql.repository;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.RegisteredStores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 08/Feb/2021
 */
@Repository
public interface RegisterdStoresRepository extends JpaRepository<RegisteredStores,Integer> {

    RegisteredStores findByStoreId(Long id);

}
