package com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model;

import javax.persistence.*;

/**
 * @author Anand SN
 * Created date : 09/Feb/2021
 */
@Entity
@Table(name = "mapping_storeId")
public class MappingStoreId {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mapping_id")
    private Long mappingId;

    private Long oldStoreId;

    private Long newStoreId;

    private Boolean isMigrated =false;

    public MappingStoreId() {
    }

    public Long getMappingId() {
        return mappingId;
    }

    public void setMappingId(Long mappingId) {
        this.mappingId = mappingId;
    }

    public Long getOldStoreId() {
        return oldStoreId;
    }

    public void setOldStoreId(Long oldStoreId) {
        this.oldStoreId = oldStoreId;
    }

    public Long getNewStoreId() {
        return newStoreId;
    }

    public void setNewStoreId(Long newStoreId) {
        this.newStoreId = newStoreId;
    }

    public Boolean getMigrated() {
        return isMigrated;
    }

    public void setMigrated(Boolean migrated) {
        isMigrated = migrated;
    }
}