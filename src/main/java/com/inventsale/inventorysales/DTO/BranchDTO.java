package com.inventsale.inventorysales.DTO;


public class BranchDTO {

	private Integer id;
	private String title;
	private String address;
	private String telephone;
	private String otherPhone;
	private String titleAbbreviation;
	private Integer companyId;
	private String companyName;
	
	public BranchDTO() {}
	public BranchDTO(Integer id, String title, String address, String telephone, String otherPhone,
			String titleAbbreviation, Integer companyId, String companyName) {
		super();
		this.id = id;
		this.title = title;
		this.address = address;
		this.telephone = telephone;
		this.otherPhone = otherPhone;
		this.titleAbbreviation = titleAbbreviation;
		this.companyId = companyId;
		this.companyName = companyName;
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

	public String getTitleAbbreviation() {
		return titleAbbreviation;
	}

	public void setTitleAbbreviation(String titleAbbreviation) {
		this.titleAbbreviation = titleAbbreviation;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
}
