package com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Anand SN
 * Created date : 09/Feb/2021
 */

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "barcode")
    private String barcode;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "unit")
    private String unit;

    @Column(name = "mrp")
    private Double mrp;

    @Column(name = "sell_price")
    private Double sellPrice;

    @Column(name = "article_id")
    private String articleId;

    @Column(name = "is_deleted")
    private Boolean isDeleted = false;

    @Column(name = "is_gdb")
    private Boolean isGdb;

    @Column(name = "tsv")
    private String tsv;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "store_id")
    private Long storeid;

    @Column(name = "subcategory_id")
    private Integer subcategoryId;

    @Column(name = "is_active")
    private Boolean isActive = true;

    public Products() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getMrp() {
        return mrp;
    }

    public void setMrp(Double mrp) {
        this.mrp = mrp;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Boolean getGdb() {
        return isGdb;
    }

    public void setGdb(Boolean gdb) {
        isGdb = gdb;
    }

    public String getTsv() {
        return tsv;
    }

    public void setTsv(String tsv) {
        this.tsv = tsv;
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

    public Long getStoreid() {
        return storeid;
    }

    public void setStoreid(Long storeid) {
        this.storeid = storeid;
    }

    public Integer getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(Integer subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}

//POSTGRESQL products table DDL
/*
CREATE TABLE public.products (
id serial NOT NULL,
barcode text NULL,
title text NULL,
description text NULL,
img_url text NULL,
unit text NULL,
mrp numeric NULL,
sell_price numeric NULL,
article_id text NULL,
is_deleted bool NULL DEFAULT false,
is_gdb bool NULL,
tsv text NULL,
created_at date NULL DEFAULT now(),
updated_at date NULL DEFAULT now(),
store_id int4 NULL,
subcategory_id int4 NULL,
is_active bool NULL DEFAULT true,
CONSTRAINT products_pkey PRIMARY KEY (id),
CONSTRAINT products_store_id_fkey FOREIGN KEY (store_id) REFERENCES stores(id) ON UPDATE CASCADE ON DELETE SET NULL,
CONSTRAINT products_subcategory_id_fkey FOREIGN KEY (subcategory_id) REFERENCES categories(id) ON UPDATE CASCADE ON DELETE SET NULL
);
*/
