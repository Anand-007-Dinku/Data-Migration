package com.cloudtech.snapbizz.snaporder.datamigration.mysql.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Anand SN
 * Created date : 16/Feb/2021
 */

@Entity
@Table(name = "sub_category_lkp")
public class MysqlSubCategoryLKP {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "subCategoryId")
    private String id;

    @Column(name = "subCategoryDescription")
    private String subCategoryDescription;

    @Column(name = "subcategoryDefaultImages")
    private String subcategoryDefaultImages;

    @Column(name = "modified_date")
    private Timestamp modifiedDate;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "banner_image")
    private String bannerImage;

    @Column(name = "sub_category_id")
    private String sub_categoryId;

    @Column(name = "sub_category_description")
    private String sub_category_description;

    @Column(name = "categoryId")
    private String categoryId;

    public MysqlSubCategoryLKP() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubCategoryDescription() {
        return subCategoryDescription;
    }

    public void setSubCategoryDescription(String subCategoryDescription) {
        this.subCategoryDescription = subCategoryDescription;
    }

    public String getSubcategoryDefaultImages() {
        return subcategoryDefaultImages;
    }

    public void setSubcategoryDefaultImages(String subcategoryDefaultImages) {
        this.subcategoryDefaultImages = subcategoryDefaultImages;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public String getSub_categoryId() {
        return sub_categoryId;
    }

    public void setSub_categoryId(String sub_categoryId) {
        this.sub_categoryId = sub_categoryId;
    }

    public String getSub_category_description() {
        return sub_category_description;
    }

    public void setSub_category_description(String sub_category_description) {
        this.sub_category_description = sub_category_description;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}

//POSTGRESQL sub_category_lkp table DDL
/*CREATE TABLE `sub_category_lkp` (
  `subCategoryId` varchar(25) NOT NULL,
  `subCategoryDescription` varchar(500) DEFAULT NULL,
  `subcategoryDefaultImages` varchar(250) DEFAULT NULL,
  `modified_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `banner_image` varchar(100) DEFAULT NULL,
  `sub_category_id` varchar(255) DEFAULT NULL,
  `sub_category_description` varchar(255) DEFAULT NULL,
  `categoryId` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`subCategoryId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8*/