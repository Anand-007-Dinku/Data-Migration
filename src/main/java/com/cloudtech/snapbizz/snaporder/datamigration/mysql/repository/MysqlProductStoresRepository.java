package com.cloudtech.snapbizz.snaporder.datamigration.mysql.repository;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.MysqlProductStores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 09/Feb/2021
 */

@Repository
public interface MysqlProductStoresRepository extends JpaRepository<MysqlProductStores, Integer> {

    public List<MysqlProductStores> findByProductId(Long id);

    public List<MysqlProductStores> findByStoreId(Long storeId);
}
