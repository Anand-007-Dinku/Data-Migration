package com.cloudtech.snapbizz.snaporder.datamigration.postgresql.repository;

import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.Stores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Anand SN
 * Created date : 08/Feb/2021
 */
@Repository
public interface StoresRepository extends JpaRepository<Stores, Long> {
}
