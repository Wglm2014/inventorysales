package com.inventsale.inventorysales.repositories.general;

import com.inventsale.inventorysales.entities.general.Department;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	//all the methods are giving by JpaRepository
}
