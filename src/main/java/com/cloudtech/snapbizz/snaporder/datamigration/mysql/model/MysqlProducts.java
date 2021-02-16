package com.cloudtech.snapbizz.snaporder.datamigration.mysql.model;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Timestamp;

/**
 * @author Anand SN
 * Created date : 09/Feb/2021
 */

@Entity
@Table(name = "products")
public class MysqlProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "PRODUCTID")
    private Long productId;

    @Column(name = "PRODUCTNAME")
    private String productName;

    @Column(name = "PRODUCTDESCRIPTION")
    private String productDescription;

    @Column(name = "BARCODE")
    private String barcode;

    @Column(name = "ICON")
    private java.sql.Blob icon;

    @Column(name = "PRODUCTCATEGORY")
    private String productCategory;

    @Column(name = "PRODUCT_SUB_CATEGORY")
    private String productSubCategory;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "MANUFACTUREDETAILS")
    private String manufactureDetails;

    @Column(name = "productFeature")
    private String productFeature;

    @Column(name = "Ingedients")
    private String ingedients;

    @Column(name = "NutritionFacts")
    private java.sql.Blob nutritionFacts;

    @Column(name = "ImageUrl")
    private String imageUrl;

    @Column(name = "ICONNAME")
    private String iconName;

    @Column(name = "NUTRIIMAGENAME")
    private String nutriImageName;

    @Column(name = "DELETEFLAG")
    private Integer deleteFlag;

    @Column(name = "specialized_store_id")
    private Integer specializedStoreId;

    @Column(name = "modifeid_date")
    private Timestamp modifeidDate;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "createby")
    private Integer createby;

    @Column(name = "modifiedby")
    private Integer modifiedBy;

    @Column(name = "reason")
    private String reason;

    @Column(name = "product_type")
    private String productType;

    @Column(name = "store_type_id")
    private Long storeTypeId;

    @Column(name = "sync_batch_id")
    private Long syncBatchId;

    public MysqlProducts() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Blob getIcon() {
        return icon;
    }

    public void setIcon(Blob icon) {
        this.icon = icon;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductSubCategory() {
        return productSubCategory;
    }

    public void setProductSubCategory(String productSubCategory) {
        this.productSubCategory = productSubCategory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufactureDetails() {
        return manufactureDetails;
    }

    public void setManufactureDetails(String manufactureDetails) {
        this.manufactureDetails = manufactureDetails;
    }

    public String getProductFeature() {
        return productFeature;
    }

    public void setProductFeature(String productFeature) {
        this.productFeature = productFeature;
    }

    public String getIngedients() {
        return ingedients;
    }

    public void setIngedients(String ingedients) {
        this.ingedients = ingedients;
    }

    public Blob getNutritionFacts() {
        return nutritionFacts;
    }

    public void setNutritionFacts(Blob nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public String getNutriImageName() {
        return nutriImageName;
    }

    public void setNutriImageName(String nutriImageName) {
        this.nutriImageName = nutriImageName;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getSpecializedStoreId() {
        return specializedStoreId;
    }

    public void setSpecializedStoreId(Integer specializedStoreId) {
        this.specializedStoreId = specializedStoreId;
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

    public Integer getCreateby() {
        return createby;
    }

    public void setCreateby(Integer createby) {
        this.createby = createby;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Long getStoreTypeId() {
        return storeTypeId;
    }

    public void setStoreTypeId(Long storeTypeId) {
        this.storeTypeId = storeTypeId;
    }

    public Long getSyncBatchId() {
        return syncBatchId;
    }

    public void setSyncBatchId(Long syncBatchId) {
        this.syncBatchId = syncBatchId;
    }
}

//MYSQL products Table DDL
/*
   CREATE TABLE `products` (
  `PRODUCTID` bigint(1) NOT NULL AUTO_INCREMENT,
  `PRODUCTNAME` varchar(500) NOT NULL,
  `PRODUCTDESCRIPTION` varchar(500) DEFAULT NULL,
  `BARCODE` varchar(25) NOT NULL,
  `ICON` blob,
  `PRODUCTCATEGORY` varchar(30) DEFAULT NULL,
  `PRODUCT_SUB_CATEGORY` varchar(30) DEFAULT NULL,
  `BRAND` varchar(100) DEFAULT NULL,
  `MANUFACTUREDETAILS` varchar(500) DEFAULT NULL,
  `productFeature` varchar(500) DEFAULT NULL,
  `Ingedients` varchar(500) DEFAULT NULL,
  `NutritionFacts` blob,
  `ImageUrl` varchar(100) DEFAULT NULL,
  `ICONNAME` varchar(250) NOT NULL,
  `NUTRIIMAGENAME` varchar(100) DEFAULT NULL,
  `DELETEFLAG` int(11) DEFAULT NULL,
  `specialized_store_id` int(11) DEFAULT NULL,
  `modifeid_date` timestamp NULL DEFAULT NULL,
  `created_date` timestamp NULL DEFAULT NULL,
  `createby` int(11) DEFAULT NULL,
  `modifiedby` int(11) DEFAULT NULL,
  `reason` varchar(1000) DEFAULT NULL,
  `product_type` varchar(50) DEFAULT NULL,
  `store_type_id` bigint(20) DEFAULT NULL,
  `sync_batch_id` bigint(20) DEFAULT '0',
  PRIMARY KEY (`PRODUCTID`),
  KEY `cat_FK` (`PRODUCTCATEGORY`),
  KEY `sub_cat_FK` (`PRODUCT_SUB_CATEGORY`),
  KEY `brand_FK` (`BRAND`),
  KEY `fk_prod_store_type_Id` (`store_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=248634 DEFAULT CHARSET=utf8
*/