package com.inventsale.inventorysales.services.general;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventsale.inventorysales.entities.general.Branch;
import com.inventsale.inventorysales.repositories.general.BranchRepository;
@Service
public class BranchServiceImpl implements BranchService {
	
	private BranchRepository branchRepository;
	
	@Autowired
	public BranchServiceImpl(BranchRepository branchRepository){
		this.branchRepository = branchRepository;
	}

	@Override
	public List<Branch> findAll() {
		return branchRepository.findAll();
	}

	@Override
	public Branch findById(Integer id) {
		Branch branch = null;
		Optional<Branch> result = branchRepository.findById(id);
		if (result.isPresent()) {
			branch = result.get();
		} else {
			throw new RuntimeException("Branch with id: "+id+" no encontrada");
		}
		return branch;
	}

	@Override
	public void save(Branch branch) {
		branchRepository.save(branch);

	}

	@Override
	public void deleteById(Integer id) {
		branchRepository.deleteById(id);

	}

}
