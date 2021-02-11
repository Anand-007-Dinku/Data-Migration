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
    private Long store_id;

    private Integer sb_id;

    private Integer metro_dc_id;

    private String phone;

    private String pwd;

    private String name;

    private String street;

    private String city;

    private String state;

    private String country;

    private String pin;

    private String latitude;

    private String longitude;

    private String service_area;

    private Timestamp subscription_expiry_date;

    private String min_order_value;

    private String owner_name;

    private String working_day;

    private String working_timing;

    @Column(name = "created_at")
    private Timestamp created_at;

    @Column(name = "updated_at")
    private Timestamp updated_at;

    private String payment_modes;

    public Stores() {
    }

    public Long getStore_id() {
        return store_id;
    }

    public void setStore_id(Long store_id) {
        this.store_id = store_id;
    }

    public Integer getSb_id() {
        return sb_id;
    }

    public void setSb_id(Integer sb_id) {
        this.sb_id = sb_id;
    }

    public Integer getMetro_dc_id() {
        return metro_dc_id;
    }

    public void setMetro_dc_id(Integer metro_dc_id) {
        this.metro_dc_id = metro_dc_id;
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

    public String getService_area() {
        return service_area;
    }

    public void setService_area(String service_area) {
        this.service_area = service_area;
    }

    public Timestamp getSubscription_expiry_date() {
        return subscription_expiry_date;
    }

    public void setSubscription_expiry_date(Timestamp subscription_expiry_date) {
        this.subscription_expiry_date = subscription_expiry_date;
    }

    public String getMin_order_value() {
        return min_order_value;
    }

    public void setMin_order_value(String min_order_value) {
        this.min_order_value = min_order_value;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getWorking_day() {
        return working_day;
    }

    public void setWorking_day(String working_day) {
        this.working_day = working_day;
    }

    public String getWorking_timing() {
        return working_timing;
    }

    public void setWorking_timing(String working_timing) {
        this.working_timing = working_timing;
    }

    public String getPayment_modes() {
        return payment_modes;
    }

    public void setPayment_modes(String payment_modes) {
        this.payment_modes = payment_modes;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}