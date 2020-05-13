package com.inventsale.inventorysales.services.general;



import com.inventsale.inventorysales.entities.general.Department;

import java.util.List;



public interface DepartmentService {
	
		public List<Department> findALL();
		public Department findById(Integer id);
		public void save(Department department);
		public void deleteById(Integer id);
	

}