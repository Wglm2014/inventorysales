package com.inventsale.inventorysales.services.general;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventsale.inventorysales.entities.general.Company;
import com.inventsale.inventorysales.repositories.general.CompanyRepository;
@Service
public class CompanyServiceImpl implements CompanyService {
	
	//declare the repository
	private CompanyRepository companyRepository;
	
	@Autowired
	public CompanyServiceImpl(CompanyRepository companyRepository){
		this.companyRepository = companyRepository;
	}
	

	@Override
	public List<Company> findAll() {
		return companyRepository.findAll();
	}

	@Override
	public Company findById(Integer id) {
		Company company = null;
		
		Optional<Company> result = companyRepository.findById(id);
		if (result.isPresent()) {
			company = result.get();
		} else {
			throw new RuntimeException("Company with id: "+id+" no encontrado");
		}
		
		return company;
	}

	@Override
	public void save(Company company) {
		companyRepository.save(company);

	}

	@Override
	public void deleteById(Integer id) {
		companyRepository.deleteById(id);

	}

}
