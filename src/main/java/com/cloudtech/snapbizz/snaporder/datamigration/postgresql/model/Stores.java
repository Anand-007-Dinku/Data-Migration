package com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author Anand SN
 * Created date : 08/Feb/2021
 */
@Entity
@Table(name = "stores")
public class Stores {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long storeId;

    @Column(name = "sb_id")
    private Integer sbId;

    @Column(name = "metro_dc_id")
    private Integer metroDcId;

    @Column(name = "phone")
    private String phone;

    @Column(name = "pwd")
    private String pwd;

    @Column(name = "name")
    private String name;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "pin")
    private String pin;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "service_area")
    private String serviceArea;

    @Column(name = "subscription_expiry_date")
    private Timestamp subscriptionExpiryDate;

    @Column(name = "min_order_value")
    private String minOrderValue;

    @Column(name = "owner_name")
    private String ownerName;

    @Column(name = "working_day")
    private String workingDay;

    @Column(name = "working_timing")
    private String workingTiming;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "payment_modes")
    private String paymentModes;

    public Stores() {
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Integer getSbId() {
        return sbId;
    }

    public void setSbId(Integer sbId) {
        this.sbId = sbId;
    }

    public Integer getMetroDcId() {
        return metroDcId;
    }

    public void setMetroDcId(Integer metroDcId) {
        this.metroDcId = metroDcId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
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

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public Timestamp getSubscriptionExpiryDate() {
        return subscriptionExpiryDate;
    }

    public void setSubscriptionExpiryDate(Timestamp subscriptionExpiryDate) {
        this.subscriptionExpiryDate = subscriptionExpiryDate;
    }

    public String getMinOrderValue() {
        return minOrderValue;
    }

    public void setMinOrderValue(String minOrderValue) {
        this.minOrderValue = minOrderValue;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(String workingDay) {
        this.workingDay = workingDay;
    }

    public String getWorkingTiming() {
        return workingTiming;
    }

    public void setWorkingTiming(String workingTiming) {
        this.workingTiming = workingTiming;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getPaymentModes() {
        return paymentModes;
    }

    public void setPaymentModes(String paymentModes) {
        this.paymentModes = paymentModes;
    }
}

//POSTGRESQL stores table DDL
/*CREATE TABLE public.stores (
id serial NOT NULL,
sb_id int4 NOT NULL,
metro_dc_id int4 NULL,
phone varchar(255) NULL,
pwd varchar(255) NULL,
name varchar(255) NULL,
street varchar(255) NULL,
city varchar(255) NULL,
state varchar(255) NULL,
country varchar(255) NULL,
pin varchar(255) NULL,
latitude varchar(255) NULL DEFAULT '0.0'::character varying,
longitude varchar(255) NULL DEFAULT '0.0'::character varying,
service_area varchar(255) NULL,
subscription_expiry_date varchar(255) NULL,
min_order_value varchar(255) NOT NULL,
owner_name varchar(255) NULL,
working_day text NULL,
working_timing varchar(255) NULL,
created_at timestamptz NULL DEFAULT now(),
updated_at timestamptz NULL DEFAULT now(),
payment_modes varchar NOT NULL DEFAULT 'Cash'::character varying,
CONSTRAINT stores_phone_key UNIQUE (phone),
CONSTRAINT stores_pkey PRIMARY KEY (id),
CONSTRAINT stores_sb_id_key UNIQUE (sb_id)
);*/