package com.inventsale.inventorysales.repositories.general;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventsale.inventorysales.entities.general.Municipality;

public interface MunicipalityRepository extends JpaRepository<Municipality, Integer> {

	List<Municipality> findByDepartmentId(Integer departmentId);

}
