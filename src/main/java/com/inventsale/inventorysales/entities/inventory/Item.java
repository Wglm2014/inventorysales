package com.inventsale.inventorysales.entities.inventory;

import com.inventsale.inventorysales.entities.inventory.ItemCategory;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.persistence.OneToMany;

import java.util.Set;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer id;
    @Column(name = "code")
    private String code;
    @Column(name = "title")
    @NotNull
    private String title;
    @Column(name = "long_title")
    private String longTitle;
    @Column(name = "sky")
    private String sku;
    @Column(name = "brand")
    private String brand;
    @Column(name = "bar_code")
    private String barCode;
    @Column(name = "price")
    @NotNull
    private double salePrice;
    @Column(name = "cost")
    private double cost;
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "last_modified_by")
    private String lastModifiedBy;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id", insertable = false, updatable = false)
    private ItemCategory itemCategory;

    public Item() {
    }

    public Item(Integer id, String code, String title, String longTitle, String sku, String brand, String barCode,
            double salePrice, double cost, Integer categoryId, String createdBy, String lastModifiedBy) {
        this.id = id;
        this.code = code;
        this.title = title;
        this.longTitle = longTitle;
        this.sku = sku;
        this.brand = brand;
        this.barCode = barCode;
        this.salePrice = salePrice;
        this.cost = cost;
        this.categoryId = categoryId;
        this.createdBy = createdBy;
        this.lastModifiedBy = lastModifiedBy;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLongTitle() {
        return this.longTitle;
    }

    public void setLongTitle(String longTitle) {
        this.longTitle = longTitle;
    }

    public String getSku() {
        return this.sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public double getSalePrice() {
        return this.salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public ItemCategory getItemCategory() {
        return this.itemCategory;
    }

    public void setItemCategory(ItemCategory itemCategory) {
        this.itemCategory = itemCategory;
    }

}
