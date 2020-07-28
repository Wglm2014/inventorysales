package com.inventsale.inventorysales.entities.general;

import javax.persistence.Column;

public class CompanyClone {

	private Integer id;

	private String title;
	
	private String commercialName;
	
	private String address;
	
	private String telephone;
	
	private String otherPhone;
	
	private String logoContentType;
	
	private String createdBy;
		
	private String logo;
	
	@Column(name="last_modified_by")
	private String modifyBy;
	
	@Column(name="contributor_registry_number")
	private String contributorRegistryNumber;
	
	@Column(name="contributor_name")
	private String contributorName;
	
	@Column(name="nit")
	private String nit;
	
	@Column(name="activity")
	private String activity;
	
	@Column(name="social_reason")
	private String socialReason;

	public CompanyClone() {}

	public CompanyClone(Integer id, String title, String commercialName, String address, String telephone, String otherPhone,
			String logo, String logoContentType, String createdBy, String modifyBy,
			String contributorRegistryNumber, String contributorName,String nit, String activity, String socialReason) {
		
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
		this.modifyBy = modifyBy;
		this.contributorRegistryNumber= contributorRegistryNumber;
		this.contributorName = contributorName;
		this.nit = nit;
		this.activity = activity;
		this.socialReason = socialReason;
		
		
		
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

	

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
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

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getContributorRegistryNumber() {
		return contributorRegistryNumber;
	}

	public void setContributorRegistryNumber(String contributorRegistryNumber) {
		this.contributorRegistryNumber = contributorRegistryNumber;
	}

	public String getContributorName() {
		return contributorName;
	}

	public void setContributorName(String contributorName) {
		this.contributorName = contributorName;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getSocialReason() {
		return socialReason;
	}

	public void setSocialReason(String socialReason) {
		this.socialReason = socialReason;
	}
	
}
