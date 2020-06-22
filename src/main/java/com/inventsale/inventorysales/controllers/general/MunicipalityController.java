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

import com.inventsale.inventorysales.entities.general.Municipality;
import com.inventsale.inventorysales.services.general.MunicipalityService;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class MunicipalityController {
	MunicipalityService municipalityService;
	
	@Autowired
	MunicipalityController(MunicipalityService municipalityService){
		this.municipalityService = municipalityService;
	}
	
	@GetMapping("/municipality")
	public List<Municipality> getMunicipalities(){
		
		return municipalityService.findAll();
		
	}
	
	@GetMapping("/municipality/{departmentId}")
	public List<Municipality> getMunicipalityByDepartment(@PathVariable Integer departmentId){
		System.out.println(departmentId);
		List<Municipality> result = municipalityService.findByDepartmentId(departmentId);
		
		System.out.println(result);
		if (result.isEmpty()) {
			throw new RuntimeException("Municipality related to department with id:"+departmentId+"not found"); 
		}
		return result;
	}
	
	@PostMapping("/municipality")
	public Municipality addMunicipality(@RequestBody Municipality municipality) {
		System.out.println(municipality);
		municipalityService.save(municipality);
		return municipality;
	}
	
	@PutMapping("/municipality")
	public Municipality updateMunicipality(@RequestBody Municipality municipality) {
		municipalityService.save(municipality);
		return municipality;
	}
	
	@DeleteMapping("/municipality/{id}")
	public Municipality deleteMunicipality(@PathVariable Integer id){
		Municipality municipality = municipalityService.findById(id);
		if (municipality.getTitle().isEmpty()) {
			throw new RuntimeException("Municipality with Id: "+id+" does not exist");
		}
		municipalityService.deleteById(id);
		
		return municipality;
	}
	
	
}
