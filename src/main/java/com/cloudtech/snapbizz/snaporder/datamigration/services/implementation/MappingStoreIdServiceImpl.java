package com.cloudtech.snapbizz.snaporder.datamigration.services.implementation;

import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.MappingStoreId;
import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.repository.MappingStoreIdRepository;
import com.cloudtech.snapbizz.snaporder.datamigration.services.MappingStoreIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Anand SN
 * Created date : 10/Feb/2021
 */
@Service
public class MappingStoreIdServiceImpl implements MappingStoreIdService {

    @Autowired
    private MappingStoreIdRepository mappingStoreIdRepository;

    @Override
    public MappingStoreId save(MappingStoreId mappingStoreId) {
     return mappingStoreIdRepository.save(mappingStoreId);
    }

    @Override
    public MappingStoreId findByOldStoreId(Long oldStoreId) {
        return mappingStoreIdRepository.findByOldStoreId(oldStoreId);
    }
}
