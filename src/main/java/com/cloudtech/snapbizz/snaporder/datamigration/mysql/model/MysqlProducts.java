package com.cloudtech.snapbizz.snaporder.datamigration.mysql.model;

import javax.persistence.*;
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
    private String PRODUCTNAME;

    @Column(name = "PRODUCTDESCRIPTION")
    private String PRODUCTDESCRIPTION;

    @Column(name = "BARCODE")
    private String BARCODE;

    @Column(name = "ImageUrl")
    private String ImageUrl;

    @Column(name = "modifeid_date")
    private Timestamp modifeid_date;

    @Column(name = "created_date")
    private Timestamp created_date;

    public MysqlProducts() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getPRODUCTNAME() {
        return PRODUCTNAME;
    }

    public void setPRODUCTNAME(String PRODUCTNAME) {
        this.PRODUCTNAME = PRODUCTNAME;
    }

    public String getPRODUCTDESCRIPTION() {
        return PRODUCTDESCRIPTION;
    }

    public void setPRODUCTDESCRIPTION(String PRODUCTDESCRIPTION) {
        this.PRODUCTDESCRIPTION = PRODUCTDESCRIPTION;
    }

    public String getBARCODE() {
        return BARCODE;
    }

    public void setBARCODE(String BARCODE) {
        this.BARCODE = BARCODE;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public Timestamp getModifeid_date() {
        return modifeid_date;
    }

    public void setModifeid_date(Timestamp modifeid_date) {
        this.modifeid_date = modifeid_date;
    }

    public Timestamp getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Timestamp created_date) {
        this.created_date = created_date;
    }
}


/*

    @Column(name = "ICON")
    private java.sql.Blob ICON;

    @Column(name = "PRODUCTCATEGORY")
    private String PRODUCTCATEGORY;

    @Column(name = "PRODUCT_SUB_CATEGORY")
    private String PRODUCT_SUB_CATEGORY;

    @Column(name = "BRAND")
    private String BRAND;

    @Column(name = "MANUFACTUREDETAILS")
    private String MANUFACTUREDETAILS;

    @Column(name = "productFeature")
    private String productFeature;

    @Column(name = "Ingedients")
    private String Ingedients;

    @Column(name = "NutritionFacts")
    private java.sql.Blob NutritionFacts;

     @Column(name = "ICONNAME")
    private String ICONNAME;

    @Column(name = "NUTRIIMAGENAME")
    private String NUTRIIMAGENAME;

    @Column(name = "DELETEFLAG")
    private Integer DELETEFLAG;

    @Column(name = "specialized_store_id")
    private Boolean specialized_store_id;

    @Column(name = "createby")
    private Integer createby;

    @Column(name = "modifiedby")
    private Integer modifiedby;

    @Column(name = "reason")
    private String reason;

    @Column(name = "product_type")
    private String product_type;

    @Column(name = "store_type_id")
    private Long store_type_id;

    @Column(name = "sync_batch_id")
    private Long sync_batch_id;

    */
