package com.inventsale.inventorysales.controllers.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventsale.inventorysales.entities.general.Branch;
import com.inventsale.inventorysales.services.general.BranchService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class BranchController {
	
	private BranchService branchService;


	@Autowired
	public BranchController(BranchService branchService){
		this.branchService=branchService;
	}
	
	@GetMapping("/branch")
	public List<Branch> getAll(){
		return branchService.findAll();
	}
	
	@GetMapping("/branch/{id}")
	public Branch getBranch(@PathVariable Integer id) {
		Branch branch = branchService.findById(id);
		if (branch == null) {
			throw new RuntimeException("Sucursal with  id: "+id+" no encontrada");
		}
		return branch;
		
	}
	
	@PostMapping("/branch")
	public Branch addBranch(@RequestBody Branch branch) {
		branchService.save(branch);
		
		return branch;
	}
	
	@PutMapping("/branch")
	public Branch updateBranch(@RequestBody Branch branch) {
		branchService.save(branch);
		
		return branch;
	}
	
	@DeleteMapping("/branch/{id}")
	public String deleteBranch(@PathVariable Integer id) {
		String msg = "Sucursal no encontrada";
		Branch result = branchService.findById(id);
		if (result !=null) {
			msg = "Sucursal Eliminada";
			branchService.deleteById(id);
		}
		return msg;
	}
		
	
	
	
}
