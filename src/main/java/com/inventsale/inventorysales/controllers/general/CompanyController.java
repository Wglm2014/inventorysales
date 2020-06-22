package com.inventsale.inventorysales.controllers.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventsale.inventorysales.entities.general.Company;
import com.inventsale.inventorysales.services.general.CompanyService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CompanyController {
	
	private CompanyService companyService;
	
	@Autowired
	public CompanyController(CompanyService companyService) {
		this.companyService = companyService;
	}
	
	@GetMapping("/company")
	public List<Company> getAll(){
		
		return companyService.findAll();
	}
	
	@GetMapping("/company/{id}")
	public Company getCompany(@PathVariable Integer id) {
		Company company = companyService.findById(id);
		if (company==null) {
			throw new RuntimeException("Company with id: "+id+" no encontrada");
		}
		return company;
	}
	
	@PostMapping("/company")
	public Company addCompany(@RequestBody Company company) {
		companyService.save(company);
		return company;
	}

	@PutMapping("/company")
	public Company updateCompany(@RequestBody Company company) {
		companyService.save(company);
		return company;
	}
	
	@DeleteMapping("/company/{id}")
	public String deleteCompany(@PathVariable Integer id) {

		String msg = "Registro no encontrado";		
		Company result = companyService.findById(id);
		if (result !=null) {
			msg= "Registro Eliminidao";
			companyService.deleteById(id);
		}
		return msg;
	}
}
