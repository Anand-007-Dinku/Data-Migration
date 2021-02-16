package com.cloudtech.snapbizz.snaporder.datamigration.postgresql.model;

import javax.persistence.*;

/**
 * @author Anand SN
 * Created date : 16/Feb/2021
 */

@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "parent_id")
    private String parentId;

    public Categories() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}

//POSTGRESQL categories table DDL
/*CREATE TABLE public.categories (
id serial NOT NULL,
"name" varchar(255) NULL,
img_url text NULL,
parent_id int4 NULL,
CONSTRAINT categories_pkey PRIMARY KEY (id)
);*/
