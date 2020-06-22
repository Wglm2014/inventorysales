package com.inventsale.inventorysales.services.general;

import java.util.List;

import com.inventsale.inventorysales.entities.general.Company;

public interface CompanyService {
	public List<Company> findAll();
	public Company findById(Integer id);
	public void save(Company company);
	public void deleteById(Integer id);

}
