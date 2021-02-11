package com.cloudtech.snapbizz.snaporder.datamigration.postgresql.repository;

import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.MappingStoreId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Anand SN
 * Created date : 09/Feb/2021
 */
@Repository
public interface MappingStoreIdRepository extends JpaRepository<MappingStoreId, Long> {

    MappingStoreId findByOldStoreId(Long oldStoreId);

}
