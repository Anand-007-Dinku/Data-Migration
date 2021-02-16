package com.cloudtech.snapbizz.snaporder.datamigration.mysql.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author Anand SN
 * Created date : 08/Feb/2021
 */

@Entity
@Table(name = "registered_stores")
public class RegisteredStores implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STOREID")
    private Long storeId;

    @Column(name = "STORENAME")
    private String storeName;

    @Column(name = "STORETYPECODE")
    private String storeTypeCode;

    @Column(name = "NOOFREVIEWS")
    private Integer noOfReviews;

    @Column(name = "RATING")
    private Integer rating;

    @Lob
    @Column(name = "ICON", columnDefinition="BLOB")
    private byte[] icon;

    @Lob
    @Column(name = "COMMENTS", columnDefinition = "BLOB")
    private String comments;

    @Column(name = "STOREADDRESSID")
    private Long storeAddressId;

    @Column(name = "ADDRESS1")
    private String address1;

    @Column(name = "ADDRESS2")
    private String address2;

    @Column(name = "ZIPCODE")
    private String zipcode;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "PHONENUMBER")
    private String phoneNumber;

    @Column(name = "LAT")
    private String latitude;

    @Column(name = "LANG")
    private String longitude;

    @Column(name = "STOREICONURL")
    private String storeIconUrl;

    @Column(name = "TAX")
    private String tax;

    @Column(name = "SERVICETAX")
    private String serviceTax;

    @Column(name = "DELIVERYCHARGE")
    private String deliveryCharge;

    @Column(name = "ICONNAME")
    private String iconName;

    @Column(name = "street")
    private String street;

    @Column(name = "location")
    private String location;

    @Column(name = "min_order_value")
    private double minOrderValue;

    @Column(name = "created_date")
    @Type(type = "timestamp")
    private Timestamp createdDate;

    @Column(name = "modified_date")
    @Type(type = "timestamp")
    private Timestamp modifiedDate;

    @Column(name = "deleteflag")
    private int deleteflag;

    @Column(name = "proprietor_name")
    private String proprietorName;

    @Column(name = "established_on")
    private java.sql.Date establishedOn;

    @Column(name = "landline_number")
    private String landlineNumber;

    @Column(name = "watsapp_number")
    private String watsappNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "landmark")
    private String landmark;

    @Column(name = "password")
    private String password;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "smartphone_model")
    private String smartphoneModel;

    @Column(name = "android_version")
    private String androidVersion;

    @Column(name = "working_days")
    private String workingDays;

    @Column(name = "work_timings")
    private String workTimings;

    @Column(name = "TIN_Number")
    private String tinNumber;

    @Column(name = "store_type_id")
    private int storeTypeId;

    @Column(name = "delivery_range")
    private int deliveryRange;

    @Column(name = "store_type")
    private String storeType;

    @Column(name = "lat_lang_address")
    private String latLangAddress;

    @Column(name = "store_desc")
    private String storeDesc;

    @Column(name = "page_title")
    private String pageTitle;

    @Column(name = "keywords")
    private String keywords;

    @Column(name = "branch_type")
    private String branchType;

    @Column(name = "service_area")
    private String serviceArea;

    @Column(name = "expired_on")
    @Type(type = "timestamp")
    private Timestamp expiredOn;

    public RegisteredStores() {
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreTypeCode() {
        return storeTypeCode;
    }

    public void setStoreTypeCode(String storeTypeCode) {
        this.storeTypeCode = storeTypeCode;
    }

    public Integer getNoOfReviews() {
        return noOfReviews;
    }

    public void setNoOfReviews(Integer noOfReviews) {
        this.noOfReviews = noOfReviews;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public byte[] getIcon() {
        return icon;
    }

    public void setIcon(byte[] icon) {
        this.icon = icon;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Long getStoreAddressId() {
        return storeAddressId;
    }

    public void setStoreAddressId(Long storeAddressId) {
        this.storeAddressId = storeAddressId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getStoreIconUrl() {
        return storeIconUrl;
    }

    public void setStoreIconUrl(String storeIconUrl) {
        this.storeIconUrl = storeIconUrl;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getServiceTax() {
        return serviceTax;
    }

    public void setServiceTax(String serviceTax) {
        this.serviceTax = serviceTax;
    }

    public String getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(String deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getMinOrderValue() {
        return minOrderValue;
    }

    public void setMinOrderValue(double minOrderValue) {
        this.minOrderValue = minOrderValue;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(int deleteflag) {
        this.deleteflag = deleteflag;
    }

    public String getProprietorName() {
        return proprietorName;
    }

    public void setProprietorName(String proprietorName) {
        this.proprietorName = proprietorName;
    }

    public Date getEstablishedOn() {
        return establishedOn;
    }

    public void setEstablishedOn(Date establishedOn) {
        this.establishedOn = establishedOn;
    }

    public String getLandlineNumber() {
        return landlineNumber;
    }

    public void setLandlineNumber(String landlineNumber) {
        this.landlineNumber = landlineNumber;
    }

    public String getWatsappNumber() {
        return watsappNumber;
    }

    public void setWatsappNumber(String watsappNumber) {
        this.watsappNumber = watsappNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getSmartphoneModel() {
        return smartphoneModel;
    }

    public void setSmartphoneModel(String smartphoneModel) {
        this.smartphoneModel = smartphoneModel;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(String workingDays) {
        this.workingDays = workingDays;
    }

    public String getWorkTimings() {
        return workTimings;
    }

    public void setWorkTimings(String workTimings) {
        this.workTimings = workTimings;
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public int getStoreTypeId() {
        return storeTypeId;
    }

    public void setStoreTypeId(int storeTypeId) {
        this.storeTypeId = storeTypeId;
    }

    public int getDeliveryRange() {
        return deliveryRange;
    }

    public void setDeliveryRange(int deliveryRange) {
        this.deliveryRange = deliveryRange;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getLatLangAddress() {
        return latLangAddress;
    }

    public void setLatLangAddress(String latLangAddress) {
        this.latLangAddress = latLangAddress;
    }

    public String getStoreDesc() {
        return storeDesc;
    }

    public void setStoreDesc(String storeDesc) {
        this.storeDesc = storeDesc;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getBranchType() {
        return branchType;
    }

    public void setBranchType(String branchType) {
        this.branchType = branchType;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public Timestamp getExpiredOn() {
        return expiredOn;
    }

    public void setExpiredOn(Timestamp expiredOn) {
        this.expiredOn = expiredOn;
    }
}

//MYSQL registered_stores table DDL
/*CREATE TABLE `registered_stores` (
  `STOREID` bigint(20) NOT NULL,
  `STORENAME` varchar(100) NOT NULL,
  `STORETYPECODE` varchar(3) NOT NULL,
  `NOOFREVIEWS` int(11) NOT NULL,
  `RATING` int(11) NOT NULL,
  `ICON` blob,
  `COMMENTS` blob,
  `STOREADDRESSID` bigint(20) DEFAULT NULL,
  `ADDRESS1` varchar(250) NOT NULL,
  `ADDRESS2` varchar(250) DEFAULT NULL,
  `ZIPCODE` varchar(15) NOT NULL,
  `CITY` varchar(200) NOT NULL,
  `STATE` varchar(15) NOT NULL,
  `COUNTRY` varchar(15) NOT NULL,
  `PHONENUMBER` varchar(25) DEFAULT NULL,
  `LAT` varchar(220) DEFAULT NULL,
  `LANG` varchar(220) DEFAULT NULL,
  `STOREICONURL` varchar(1024) DEFAULT NULL,
  `TAX` varchar(25) DEFAULT NULL,
  `SERVICETAX` varchar(25) DEFAULT NULL,
  `DELIVERYCHARGE` varchar(25) DEFAULT NULL,
  `ICONNAME` varchar(100) DEFAULT NULL,
  `street` varchar(100) DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL,
  `min_order_value` double DEFAULT NULL,
  `modified_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `created_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `deleteflag` int(11) DEFAULT NULL,
  `proprietor_name` varchar(50) DEFAULT NULL,
  `established_on` date DEFAULT NULL,
  `landline_number` varchar(15) DEFAULT NULL,
  `watsapp_number` varchar(15) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `landmark` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `mobile_number` varchar(50) DEFAULT NULL,
  `smartphone_model` varchar(50) DEFAULT NULL,
  `android_version` varchar(50) DEFAULT NULL,
  `working_days` varchar(50) DEFAULT NULL,
  `work_timings` varchar(50) DEFAULT NULL,
  `TIN_Number` varchar(50) DEFAULT NULL,
  `store_type_id` bigint(20) DEFAULT NULL,
  `delivery_range` int(11) DEFAULT NULL,
  `store_type` varchar(50) DEFAULT NULL,
  `lat_lang_address` varchar(250) DEFAULT NULL,
  `store_desc` text,
  `page_title` varchar(100) DEFAULT NULL,
  `keywords` varchar(300) DEFAULT NULL,
  `branch_type` varchar(50) NOT NULL,
  `service_area` varchar(500) NOT NULL,
  `expired_on` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`STOREID`),
  KEY `fk_store_type_id` (`store_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8*/