package com.cloudtech.snapbizz.snaporder.datamigration.mysql.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
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

    private String STORENAME;

    private String LAT;

    private String LANG;

    private String ZIPCODE;

    private String CITY;

    private String STATE;

    private String COUNTRY;

    private String street;

    private double min_order_value;

    private int deleteflag;

    private String proprietor_name;

    private String password;

    private String mobile_number;

    private String working_days;

    private String work_timings;

    private String service_area;

    @Type(type = "timestamp")
    private Timestamp modified_date;

    @Type(type = "timestamp")
    private Timestamp created_date;

    @Type(type = "timestamp")
    private Timestamp expired_on;


//   @Lob
//   @Column(name = "icon", columnDefinition="BLOB")
//    private byte[] ICON;

//    @Lob
//    @Column(name = "comments", columnDefinition = "BLOB")
//    private String COMMENTS;


//    @Type(type = "timestamp")
//    private Timestamp established_on;


//    private String STORETYPECODE;
//    private int NOOFREVIEWS;
//    private int RATING;
//    private int STOREADDRESSID;
//    private String ADDRESS1;
//    private String ADDRESS2;
//    private String PHONENUMBER;
//    private String STOREICONURL;
//    private String TAX;
//    private String SERVICETAX;
//    private String DELIVERYCHARGE;
//    private String ICONNAME;
//    private String location;
//    private String landline_number;
//    private String watsapp_number;
//    private String email;
//    private String landmark;
//    private String smartphone_model;
//    private String android_version;
//    private String TIN_Number;
//    private int store_type_id;
//    private int delivery_range;
//    private String store_type;
//    private String lat_lang_address;
//    private String store_desc;
//   private String page_title;
//   private String keywords;
//   private String branch_type;


    public RegisteredStores() {
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getSTORENAME() {
        return STORENAME;
    }

    public void setSTORENAME(String STORENAME) {
        this.STORENAME = STORENAME;
    }

    public String getLAT() {
        return LAT;
    }

    public void setLAT(String LAT) {
        this.LAT = LAT;
    }

    public String getLANG() {
        return LANG;
    }

    public void setLANG(String LANG) {
        this.LANG = LANG;
    }

    public String getZIPCODE() {
        return ZIPCODE;
    }

    public void setZIPCODE(String ZIPCODE) {
        this.ZIPCODE = ZIPCODE;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public double getMin_order_value() {
        return min_order_value;
    }

    public void setMin_order_value(double min_order_value) {
        this.min_order_value = min_order_value;
    }

    public int getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(int deleteflag) {
        this.deleteflag = deleteflag;
    }

    public String getProprietor_name() {
        return proprietor_name;
    }

    public void setProprietor_name(String proprietor_name) {
        this.proprietor_name = proprietor_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getWorking_days() {
        return working_days;
    }

    public void setWorking_days(String working_days) {
        this.working_days = working_days;
    }

    public String getWork_timings() {
        return work_timings;
    }

    public void setWork_timings(String work_timings) {
        this.work_timings = work_timings;
    }

    public String getService_area() {
        return service_area;
    }

    public void setService_area(String service_area) {
        this.service_area = service_area;
    }

    public Timestamp getModified_date() {
        return modified_date;
    }

    public void setModified_date(Timestamp modified_date) {
        this.modified_date = modified_date;
    }

    public Timestamp getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Timestamp created_date) {
        this.created_date = created_date;
    }

    public Timestamp getExpired_on() {
        return expired_on;
    }

    public void setExpired_on(Timestamp expired_on) {
        this.expired_on = expired_on;
    }
}