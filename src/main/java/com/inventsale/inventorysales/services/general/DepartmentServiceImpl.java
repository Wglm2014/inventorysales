package com.inventsale.inventorysales.services.general;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventsale.inventorysales.entities.general.Department;
import com.inventsale.inventorysales.repositories.general.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	private DepartmentRepository departmentRepository;
	
	@Autowired
	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	@Override
	public List<Department> findALL() {
		return departmentRepository.findAll();
	}

	@Override
	public Department findById(Integer id) {
		Department department =null;
		
		Optional<Department> result = departmentRepository.findById(id);
		
		if (result.isPresent()) {
			department = result.get();
		}else {
			throw new RuntimeException("department id - "+id+" not found");
		}
		return department;
	}

	@Override
	public  void save(Department department) {
		departmentRepository.save(department);
	}

	@Override
	public void deleteById(Integer id) {
		departmentRepository.deleteById(id);
	}




}
