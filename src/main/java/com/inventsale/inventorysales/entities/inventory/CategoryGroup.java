package com.inventsale.inventorysales.entities.inventory;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table (name="item_group")
public class CategoryGroup {
	@Id
	@Column (name="id")
	@GeneratedValue (strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native", strategy="native")
	private Integer id;
	@Column(name="title")
	@NotNull
	private String title;
	@Column(name="created_by")
	private String createdBy;
	@Column(name="last_modified_by")
	private String lastModifiedBy;
	
	@OneToMany(mappedBy="categoryGroup",cascade=CascadeType.ALL)
	private Set<ItemCategory> itemCategory;
	
	public CategoryGroup() {}
	
	public CategoryGroup(Integer id, String title, String createdBy, String lastModifiedBy) {
		super();
		this.id = id;
		this.title = title;
		this.createdBy = createdBy;
		this.lastModifiedBy = lastModifiedBy;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Set<ItemCategory> getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(Set<ItemCategory> itemCategory) {
		this.itemCategory = itemCategory;
	}
	
	
	
}
