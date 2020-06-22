package com.inventsale.inventorysales.services.general;
import java.util.List;

import com.inventsale.inventorysales.entities.general.Municipality;
public interface MunicipalityService {
	public List<Municipality> findAll();
	public List<Municipality> findByDepartmentId(Integer departmentId); 
	public Municipality findById(Integer id);
	public void save(Municipality municipality);
	public void deleteById(Integer id);
}
