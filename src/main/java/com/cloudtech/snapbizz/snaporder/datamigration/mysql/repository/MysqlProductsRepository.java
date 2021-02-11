package com.cloudtech.snapbizz.snaporder.datamigration.mysql.repository;

import com.cloudtech.snapbizz.snaporder.datamigration.mysql.model.MysqlProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.stream.Stream;

import static org.hibernate.annotations.QueryHints.READ_ONLY;
import static org.hibernate.jpa.QueryHints.HINT_CACHEABLE;
import static org.hibernate.jpa.QueryHints.HINT_FETCH_SIZE;

/**
 * @author Anand SN
 * Created date : 09/Feb/2021
 */

@Repository
public interface MysqlProductsRepository extends JpaRepository<MysqlProducts, Long> {

    public MysqlProducts findByProductId(Long id);

/*    @QueryHints(value = {
            @QueryHint(name = HINT_FETCH_SIZE, value = "" + Integer.MIN_VALUE),
            @QueryHint(name = HINT_CACHEABLE, value = "false"),
            @QueryHint(name = READ_ONLY, value = "true")
    })
    @Query("select p from MysqlProducts p")
    public Stream<MysqlProducts> getAll();*/
}
