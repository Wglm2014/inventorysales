package com.inventsale.inventorysales.entities.inventory;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "item_category")
public class ItemCategory {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Integer id;
	@Column(name = "title")
	@NotNull
	private String title;
	@Column(name = "item_group_id")
	@NotNull
	private Integer groupId;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "last_modify_by")
	private String lastModifiedBy;

	@ManyToOne
	@JoinColumn(name = "item_group_id", referencedColumnName = "id", insertable = false, updatable = false)
	private CategoryGroup categoryGroup;

	@OneToMany(mappedBy = "itemCategory", cascade = CascadeType.ALL)
	private Set<Item> item;

	public ItemCategory() {
	}

	public ItemCategory(Integer id, String title, Integer groupId, String createdBy, String lastModifiedBy) {
		super();
		this.id = id;
		this.title = title;
		this.groupId = groupId;
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

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
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

	public CategoryGroup getCategoryGroup() {
		return categoryGroup;
	}

	public void setCategoryGroup(CategoryGroup categoryGroup) {
		this.categoryGroup = categoryGroup;
	}

}
