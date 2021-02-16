package com.cloudtech.snapbizz.snaporder.datamigration.postgresql.repository;

import com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Anand SN
 * Created date : 16/Feb/2021
 */
public interface CategoriesRepository extends JpaRepository<Categories,Integer> {
}
