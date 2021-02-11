package com.cloudtech.snapbizz.snaporder.datamigration.services;

import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.MappingStoreId;
import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.Stores;

/**
 * @author Anand SN
 * Created date : 10/Feb/2021
 */
public interface MappingStoreIdService {

    public MappingStoreId save(MappingStoreId mappingStoreId);

    public MappingStoreId findByOldStoreId(Long oldStoreId);



}
