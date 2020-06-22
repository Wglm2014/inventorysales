package com.inventsale.inventorysales.services.general;

import java.util.List;

import com.inventsale.inventorysales.entities.general.Branch;

public interface BranchService {
	public List<Branch> findAll();
	public Branch findById(Integer id);
	public void save(Branch branch);
	public void deleteById(Integer id);
}
