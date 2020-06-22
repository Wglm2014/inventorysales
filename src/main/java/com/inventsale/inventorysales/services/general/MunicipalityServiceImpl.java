package com.inventsale.inventorysales.services.general;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventsale.inventorysales.entities.general.Municipality;
import com.inventsale.inventorysales.repositories.general.MunicipalityRepository;

@Service
public class MunicipalityServiceImpl implements MunicipalityService {
	MunicipalityRepository municipalityRepository;
	
	@Autowired
	MunicipalityServiceImpl (MunicipalityRepository municipalityRepository){
	 this.municipalityRepository = municipalityRepository;
	}

	@Override
	public List<Municipality> findAll() {
		return municipalityRepository.findAll();
	}

	@Override
	public List<Municipality> findByDepartmentId(Integer departmentId) {
		
		List<Municipality> result = municipalityRepository.findByDepartmentId(departmentId);
		if (result.isEmpty()) {
			throw new RuntimeException("department id - "+departmentId+" not found");
		} 
		
		return result;
	}

	@Override
	public void save(Municipality municipality) {
		municipalityRepository.save(municipality);
	}

	@Override
	public void deleteById(Integer id) {
		
		municipalityRepository.deleteById(id);
		 
	}

	@Override
	public Municipality findById(Integer id) {
		
		Municipality municipality=null;
		
		Optional<Municipality> result = municipalityRepository.findById(id);
		if (result.isPresent()) {
			municipality = result.get();
		} else {
			throw new RuntimeException("Municipality with id:"+id+" not found");
		}
		
		return municipality;
	}

}
