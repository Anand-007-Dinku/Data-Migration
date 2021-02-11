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
    private String store_name;

    @Column(name = "so_storeid")
    private Long sostoreid;

    @Column(name = "sb_storeid")
    private Integer sb_storeid;

    @Column(name = "metro_dcid")
    private Integer metro_dcid;

    @Column(name = "is_active_sync")
    private Boolean is_active_sync;

    public SBSOStoreMap() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public Long getSo_storeid() {
        return sostoreid;
    }

    public void setSo_storeid(Long sostoreid) {
        this.sostoreid = sostoreid;
    }

    public Integer getSb_storeid() {
        return sb_storeid;
    }

    public void setSb_storeid(Integer sb_storeid) {
        this.sb_storeid = sb_storeid;
    }

    public Integer getMetro_dcid() {
        return metro_dcid;
    }

    public void setMetro_dcid(Integer metro_dcid) {
        this.metro_dcid = metro_dcid;
    }

    public Boolean getIs_active_sync() {
        return is_active_sync;
    }

    public void setIs_active_sync(Boolean is_active_sync) {
        this.is_active_sync = is_active_sync;
    }
}
