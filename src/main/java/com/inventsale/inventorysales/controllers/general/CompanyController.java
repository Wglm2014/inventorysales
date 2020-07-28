package com.inventsale.inventorysales.controllers.general;



import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


//import org.json.JSONObject;
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
import com.inventsale.inventorysales.entities.general.CompanyClone;
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
	public List<CompanyClone> getAll(){
		List<Company> companies = companyService.findAll();
		List<CompanyClone> companyClones = new ArrayList<CompanyClone>();
		for (Company item:companies) {
			companyClones.add(new CompanyClone(
					item.getId(),item.getTitle(),item.getCommercialName(),
					item.getAddress(),item.getTelephone(),item.getOtherPhone(),
					new String(item.getLogo()),item.getLogoContentType(),item.getCreatedBy(),
					item.getModifyBy(), item.getContributorRegistryNumber(), item.getContributorName(),item.getNit(), 
					item.getActivity(), item.getSocialReason()
					));
		}
		return companyClones;
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
	public CompanyClone addCompany(@RequestBody CompanyClone companyClone) {
		System.out.println(companyClone.getLogo());
		Company company = new Company();
		company.setId(companyClone.getId());
		company.setAddress(companyClone.getAddress());
		company.setCommercialName(companyClone.getCommercialName());
		company.setTitle(companyClone.getTitle());
		company.setTelephone(companyClone.getTelephone());
		company.setOtherPhone(companyClone.getOtherPhone());
		company.setLogo(companyClone.getLogo().getBytes());
		company.setLogoContentType(companyClone.getLogoContentType());
		company.setCreatedBy(companyClone.getCreatedBy());
		company.setModifyBy(companyClone.getModifyBy());
		company.setContributorRegistryNumber(companyClone.getContributorRegistryNumber());
		company.setContributorName(companyClone.getContributorName());
		company.setNit(companyClone.getNit());
		company.setActivity(companyClone.getActivity());
		company.setSocialReason(companyClone.getSocialReason());
		
		companyService.save(company);
		return companyClone;
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
