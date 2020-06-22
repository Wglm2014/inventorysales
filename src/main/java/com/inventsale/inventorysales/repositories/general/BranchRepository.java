package com.inventsale.inventorysales.repositories.general;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventsale.inventorysales.entities.general.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {
	

}
