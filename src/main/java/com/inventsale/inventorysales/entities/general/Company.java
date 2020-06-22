package com.inventsale.inventorysales.entities.general;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "company")
public class Company {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Integer id;
	@Column(name = "title")
	@NotNull
	private String title;
	@Column(name = "commercial_name")
	@NotNull
	private String commercialName;
	@Column(name = "address")
	@NotNull
	private String address;
	@Column(name = "phone_1")
	@NotNull
	private String telephone;
	@Column(name = "phone_2")
	private String otherPhone;
	@Column(name = "logo")
	private byte[] logo;
	@Column(name = "logo_content_type)")
	private String logoContentType;
	@Column(name = "created_by")
	private String createdBy;
	
	@OneToMany(mappedBy="company",cascade= CascadeType.ALL)
	private Set<Branch> branch = new HashSet<>();



	public Company(Integer id, String title, String commercialName, String address, String telephone, String otherPhone,
			byte[] logo, String logoContentType, String createdBy) {
		super();
		this.id = id;
		this.title = title;
		this.commercialName = commercialName;
		this.address = address;
		this.telephone = telephone;
		this.otherPhone = otherPhone;
		this.logo = logo;
		this.logoContentType = logoContentType;
		this.createdBy = createdBy;
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

	public String getCommercialName() {
		return commercialName;
	}

	public void setCommercialName(String commercialName) {
		this.commercialName = commercialName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getOtherPhone() {
		return otherPhone;
	}

	public void setOtherPhone(String otherPhone) {
		this.otherPhone = otherPhone;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public String getLogoContentType() {
		return logoContentType;
	}

	public void setLogoContentType(String logoContentType) {
		this.logoContentType = logoContentType;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Set<Branch> getBranch() {
		return branch;
	}

	public void setBranch(Set<Branch> branch) {
		this.branch = branch;
	}
}
