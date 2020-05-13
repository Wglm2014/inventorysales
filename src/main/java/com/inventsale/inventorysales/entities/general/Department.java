package com.inventsale.inventorysales.entities.general;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="demo_Department")
public class Department {
    @Id
    @Column(name="id")
    @GeneratedValue
    private Integer id;

    @Column(name="title")
    @NotNull
    private String title;
    
    @Column(name="created_by")
    private String createdBy;
    
    @Column(name="last_modified_by")
    private String lastModifiedBy;

    public Department() {
    	
    }
    
    public Department(String title, String createdBy, String lastModifiedBy){
        this.title = title;
        this.createdBy= createdBy;
        this.lastModifiedBy = lastModifiedBy;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    

}