package com.cloudtech.snapbizz.snaporder.datamigration.services.implementation;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.RegisteredStores;
import com.cloudtech.snapbizz.snaporder.datamigration.mysql.repository.RegisterdStoresRepository;
import com.cloudtech.snapbizz.snaporder.datamigration.services.RegisteredStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Anand SN
 * Created date : 08/Feb/2021
 */

@Service
public class RegisteredStoreServiceImpl implements RegisteredStoreService {

    @Autowired
    private RegisterdStoresRepository registerdStoresRepository;

    @Override
    public List<RegisteredStores> getAllRegisteredStores() {
        return registerdStoresRepository.findAll();
    }

    @Override
    public RegisteredStores getRegisteredStoresById(Long id) {
        return registerdStoresRepository.findByStoreId(id);
    }
}
