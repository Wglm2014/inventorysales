package com.inventsale.inventorysales.entities.general;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.ManyToOne;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "branch")
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Integer id;
	@Column(name = "title")
	@NotNull
	private String title;
	@Column(name = "address")
	@NotNull
	private String address;
	@Column(name = "phone_1")
	@NotNull
	private String telephone;
	@Column(name = "phone_2")
	private String otherPhone;
	@Column(name = "title_abbreviation")
	private String titleAbbreviation;
	@Column(name = "company_id")
	@NotNull
	private Integer companyId;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "last_modified_by")
	private String lastModifiedBy;
	
	@ManyToOne
	@JoinColumn(name="company_id", referencedColumnName="id", insertable=false, updatable=false )
	private Company company; 
	


	public Branch(Integer id, String title, String address, String telephone, String otherPhone,
			String titleAbreviation, Integer companyId, String createdBy, String lastModifiedBy) {
		this.id = id;
		this.title = title;
		this.address = address;
		this.telephone = telephone;
		this.otherPhone = otherPhone;
		this.titleAbbreviation = titleAbreviation;
		this.companyId = companyId;
		this.createdBy = createdBy;
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

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getOtherPhone() {
		return this.otherPhone;
	}

	public void setOtherPhone(String otherPhone) {
		this.otherPhone = otherPhone;
	}

	public String getTitleAbreviation() {
		return this.titleAbbreviation;
	}

	public void setTitleAbreviation(String titleAbreviation) {
		this.titleAbbreviation = titleAbreviation;
	}

	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
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
	
	public Company getCompany() {
		return company;
	}

	public void setDepartment(Company company) {
		this.company = company;
	}

}
