package com.cloudtech.snapbizz.snaporder.datamigration.mysql.model;

import javax.persistence.*;

/**
 * @author Anand SN
 * Created date : 09/Feb/2021
 */
@Entity
@Table(name = "sb_so_store_map")
public class SBSOStoreMap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "store_name")
    private String storeName;

    @Column(name = "so_storeid")
    private Long sostoreId;

    @Column(name = "sb_storeid")
    private Integer sbStoreid;

    @Column(name = "metro_dcid")
    private Integer metroDcId;

    @Column(name = "is_active_sync")
    private Boolean isActiveSync;

    public SBSOStoreMap() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Long getSostoreId() {
        return sostoreId;
    }

    public void setSostoreId(Long sostoreId) {
        this.sostoreId = sostoreId;
    }

    public Integer getSbStoreid() {
        return sbStoreid;
    }

    public void setSbStoreid(Integer sbStoreid) {
        this.sbStoreid = sbStoreid;
    }

    public Integer getMetroDcId() {
        return metroDcId;
    }

    public void setMetroDcId(Integer metroDcId) {
        this.metroDcId = metroDcId;
    }

    public Boolean getActiveSync() {
        return isActiveSync;
    }

    public void setActiveSync(Boolean activeSync) {
        isActiveSync = activeSync;
    }
}


//MYSQL sb_so_store_map table DDL
/*CREATE TABLE `sb_so_store_map` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `store_name` varchar(150) DEFAULT NULL,
  `so_storeId` bigint(20) DEFAULT NULL,
  `sb_storeId` int(11) DEFAULT NULL,
  `metro_dcId` int(3) DEFAULT '0',
  `is_active_sync` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=293 DEFAULT CHARSET=utf8*/
