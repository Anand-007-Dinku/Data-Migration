package com.cloudtech.snapbizz.snaporder.datamigration.mysql.repository;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.SBSOStoreMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Anand SN
 * Created date : 09/Feb/2021
 */

@Repository
public interface StoreMapRepository extends JpaRepository<SBSOStoreMap, Integer> {

    public Optional<SBSOStoreMap> findBySostoreId(Long id);
}
