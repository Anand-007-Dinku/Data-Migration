package com.cloudtech.snapbizz.snaporder.datamigration.mysql.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author Anand SN
 * Created date : 09/Feb/2021
 */

@Entity
@Table(name = "productstores")
public class MysqlProductStores {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "PRODUCTID")
    private Long productId;

    @Column(name = "STOREID")
    private Long storeId;

    @Column(name = "PRODUCTUNIT")
    private String PRODUCTUNIT;

    @Column(name = "price")
    private Double price;

    @Column(name = "expiry")
    private java.sql.Date expiry;

    @Column(name = "MANUFACTURE")
    private String MANUFACTURE;

    @Column(name = "DISTRIBUTOR")
    private String DISTRIBUTOR;

    @Column(name = "AVAILABLEQUANTITY")
    private Long AVAILABLEQUANTITY;

    @Column(name = "SALEPRICE")
    private Double SALEPRICE;

    @Column(name = "product_unit_id")
    private Long product_unit_id;

    @Column(name = "store_mrp_price")
    private Double store_mrp_price;

    @Column(name = "offer_description")
    private String offer_description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getPRODUCTUNIT() {
        return PRODUCTUNIT;
    }

    public void setPRODUCTUNIT(String PRODUCTUNIT) {
        this.PRODUCTUNIT = PRODUCTUNIT;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public String getMANUFACTURE() {
        return MANUFACTURE;
    }

    public void setMANUFACTURE(String MANUFACTURE) {
        this.MANUFACTURE = MANUFACTURE;
    }

    public String getDISTRIBUTOR() {
        return DISTRIBUTOR;
    }

    public void setDISTRIBUTOR(String DISTRIBUTOR) {
        this.DISTRIBUTOR = DISTRIBUTOR;
    }

    public Long getAVAILABLEQUANTITY() {
        return AVAILABLEQUANTITY;
    }

    public void setAVAILABLEQUANTITY(Long AVAILABLEQUANTITY) {
        this.AVAILABLEQUANTITY = AVAILABLEQUANTITY;
    }

    public Double getSALEPRICE() {
        return SALEPRICE;
    }

    public void setSALEPRICE(Double SALEPRICE) {
        this.SALEPRICE = SALEPRICE;
    }

    public Long getProduct_unit_id() {
        return product_unit_id;
    }

    public void setProduct_unit_id(Long product_unit_id) {
        this.product_unit_id = product_unit_id;
    }

    public Double getStore_mrp_price() {
        return store_mrp_price;
    }

    public void setStore_mrp_price(Double store_mrp_price) {
        this.store_mrp_price = store_mrp_price;
    }

    public String getOffer_description() {
        return offer_description;
    }

    public void setOffer_description(String offer_description) {
        this.offer_description = offer_description;
    }
}


/*
    @Column(name = "SALESTARTDATE")
    private Timestamp SALESTARTDATE;

    @Column(name = "SALEENDDATE")
    private Timestamp SALEENDDATE;

    @Column(name = "ONSALE")
    private Boolean ONSALE;

    @Column(name = "SALEBUY")
    private Double SALEBUY;

    @Column(name = "SALEGET")
    private Double SALEGET;

    @Column(name = "DELETEFLAG")
    private Integer DELETEFLAG;

    @Column(name = "BARCODE")
    private String BARCODE;

    @Column(name = "modifeid_date")
    private Timestamp modifeid_date;

    @Column(name = "created_date")
    private Timestamp created_date;

    @Column(name = "createby")
    private Integer createby;

    @Column(name = "reason")
    private String reason;

    @Column(name = "modifiedby")
    private Integer modifiedby;

    @Column(name = "offer_description")
    private String offer_description;

    @Column(name = "offer_flag")
    private String offer_flag;

    */