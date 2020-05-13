package com.inventsale.inventorysales.controllers.general;

import com.inventsale.inventorysales.entities.general.Department;
import com.inventsale.inventorysales.services.general.DepartmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DepartmentController {
	private DepartmentService departmentService;
	
	@Autowired
	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	@GetMapping("/departments")
	public List<Department> findAll(){
		return departmentService.findALL();
	}
	
	@GetMapping("/department/{id}")
	public Department getDepartment(@PathVariable Integer id) {

		Department department = departmentService.findById(id);
		if(department==null) {
			throw new RuntimeException("Department id -"+id+" not found");
		}
		return department;
	}
	
	@PostMapping("/add-department")
	public Department addDepartment(@RequestBody Department department) {
		departmentService.save(department);
		
		return department;
	}
	
	@PutMapping("/update-department")
	public Department updateDepartment(@RequestBody Department department) {
		departmentService.save(department);
		return department;
	}
	
	@DeleteMapping("/department/{id}")
	public String deleteDepartment(@PathVariable Integer id) {
		Department tempDepartment = departmentService.findById(id);
		String msg = "Deleted Department id - " +id;
		if (tempDepartment == null) {
			msg = "Department id - "+id+" not found";
		}
		
		departmentService.deleteById(id);
		
		return msg;
	}
}