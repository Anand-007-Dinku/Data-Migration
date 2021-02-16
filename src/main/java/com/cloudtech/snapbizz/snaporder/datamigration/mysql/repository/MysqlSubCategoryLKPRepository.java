package com.cloudtech.snapbizz.snaporder.datamigration.mysql.repository;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.MysqlSubCategoryLKP;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Anand SN
 * Created date : 16/Feb/2021
 */
public interface MysqlSubCategoryLKPRepository extends JpaRepository<MysqlSubCategoryLKP,String> {
}
