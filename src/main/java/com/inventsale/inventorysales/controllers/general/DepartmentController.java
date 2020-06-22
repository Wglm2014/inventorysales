package com.inventsale.inventorysales.controllers.general;


import com.inventsale.inventorysales.entities.general.Department;
import com.inventsale.inventorysales.services.general.DepartmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class DepartmentController {
	private DepartmentService departmentService;
	
	@Autowired
	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	@GetMapping("/department")
	public List<Department> findAll(){
		return departmentService.findALL();
	}
	

	
	@GetMapping("/department/{id}")
	public Department getDepartment(@PathVariable Integer id) {

		Department department = departmentService.findById(id);
		if(department.getId()==null) {
			throw new RuntimeException("Department id -"+id+" not found");
		}
		return department;
	}
	
	@PostMapping("/department")
	public Department addDepartment(@RequestBody Department department) {
		System.out.println("api add department ready");
		System.out.println(department);
		System.out.println("that was the department");
		departmentService.save(department);
		
		return department;
	}
	
	@PutMapping("/department")
	public Department updateDepartment(@RequestBody Department department) {
		departmentService.save(department);
		return department;
	}
	
	@DeleteMapping("/department/{id}")
	public Department deleteDepartment(@PathVariable Integer id) {
		System.out.println("IS HERE");
		Department tempDepartment = departmentService.findById(id);
		String msg = "Deleted Department id - " +id;
		if (tempDepartment.getId() == null) {
			throw new RuntimeException("Departamento con id "+id+ "no encontrado"); 
		}
		
		departmentService.deleteById(id);
		
		return tempDepartment;
	}
}