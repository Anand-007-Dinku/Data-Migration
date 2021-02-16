package com.cloudtech.snapbizz.snaporder.datamigration.mysql.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

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
    private Integer productsStoreId;

    @Column(name = "PRODUCTID")
    private Long productId;

    @Column(name = "STOREID")
    private Long storeId;

    @Column(name = "PRODUCTUNIT")
    private String productUnit;

    @Column(name = "price")
    private Double price;

    @Column(name = "expiry")
    private java.sql.Date expiry;

    @Column(name = "MANUFACTURE")
    private String manufacture;

    @Column(name = "DISTRIBUTOR")
    private String distributor;

    @Column(name = "SALESTARTDATE")
    private Timestamp saleStartDate;

    @Column(name = "SALEENDDATE")
    private Timestamp saleEndDate;

    @Column(name = "ONSALE")
    private Boolean onSale;

    @Column(name = "AVAILABLEQUANTITY")
    private Long availableQuantity;

    @Column(name = "SALEPRICE")
    private Double salePrice;

    @Column(name = "SALEBUY")
    private Double saleBuy;

    @Column(name = "SALEGET")
    private Double saleGet;

    @Column(name = "DELETEFLAG")
    private Integer deleteFlag;

    @Column(name = "BARCODE")
    private String barcode;

    @Column(name = "modifeid_date")
    private Timestamp modifeidDate;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "createby")
    private Integer createBy;

    @Column(name = "reason")
    private String reason;

    @Column(name = "modifiedby")
    private Integer modifiedBy;

    @Column(name = "product_unit_id")
    private Long productUnitId;

    @Column(name = "store_mrp_price")
    private Double storeMrpPrice;

    @Column(name = "offer_description")
    private String offerDescription;

    @Column(name = "offer_flag")
    private String offerFlag;

    public MysqlProductStores() {
    }

    public Integer getProductsStoreId() {
        return productsStoreId;
    }

    public void setProductsStoreId(Integer productsStoreId) {
        this.productsStoreId = productsStoreId;
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

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
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

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public Timestamp getSaleStartDate() {
        return saleStartDate;
    }

    public void setSaleStartDate(Timestamp saleStartDate) {
        this.saleStartDate = saleStartDate;
    }

    public Timestamp getSaleEndDate() {
        return saleEndDate;
    }

    public void setSaleEndDate(Timestamp saleEndDate) {
        this.saleEndDate = saleEndDate;
    }

    public Boolean getOnSale() {
        return onSale;
    }

    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    public Long getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Long availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getSaleBuy() {
        return saleBuy;
    }

    public void setSaleBuy(Double saleBuy) {
        this.saleBuy = saleBuy;
    }

    public Double getSaleGet() {
        return saleGet;
    }

    public void setSaleGet(Double saleGet) {
        this.saleGet = saleGet;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Timestamp getModifeidDate() {
        return modifeidDate;
    }

    public void setModifeidDate(Timestamp modifeidDate) {
        this.modifeidDate = modifeidDate;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Long getProductUnitId() {
        return productUnitId;
    }

    public void setProductUnitId(Long productUnitId) {
        this.productUnitId = productUnitId;
    }

    public Double getStoreMrpPrice() {
        return storeMrpPrice;
    }

    public void setStoreMrpPrice(Double storeMrpPrice) {
        this.storeMrpPrice = storeMrpPrice;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public String getOfferFlag() {
        return offerFlag;
    }

    public void setOfferFlag(String offerFlag) {
        this.offerFlag = offerFlag;
    }
}

//MYSQL productstores Table DDL

/*CREATE TABLE `productstores` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `PRODUCTID` bigint(1) NOT NULL,
  `STOREID` bigint(20) NOT NULL,
  `PRODUCTUNIT` varchar(30) NOT NULL,
  `price` double DEFAULT NULL,
  `expiry` date DEFAULT NULL,
  `MANUFACTURE` varchar(500) DEFAULT NULL,
  `DISTRIBUTOR` varchar(500) DEFAULT NULL,
  `SALESTARTDATE` datetime DEFAULT NULL,
  `SALEENDDATE` datetime DEFAULT NULL,
  `ONSALE` varchar(1) DEFAULT NULL,
  `AVAILABLEQUANTITY` bigint(20) DEFAULT NULL,
  `SALEPRICE` double DEFAULT NULL,
  `SALEBUY` double DEFAULT NULL,
  `SALEGET` double DEFAULT NULL,
  `DELETEFLAG` int(11) DEFAULT NULL,
  `BARCODE` varchar(250) DEFAULT NULL,
  `modifeid_date` timestamp NULL DEFAULT NULL,
  `created_date` timestamp NULL DEFAULT NULL,
  `createby` int(11) DEFAULT NULL,
  `reason` varchar(500) DEFAULT NULL,
  `modifiedby` int(11) DEFAULT NULL,
  `product_unit_id` bigint(20) DEFAULT NULL,
  `store_mrp_price` double NOT NULL,
  `offer_description` varchar(1000) DEFAULT NULL,
  `offer_flag` varchar(11) DEFAULT 'No',
  PRIMARY KEY (`id`),
  KEY `fk_product` (`PRODUCTID`),
  KEY `store_fk` (`STOREID`),
  KEY `fk_product_unit_id` (`product_unit_id`),
  KEY `BARCODE` (`BARCODE`)
) ENGINE=InnoDB AUTO_INCREMENT=257258 DEFAULT CHARSET=utf8*/