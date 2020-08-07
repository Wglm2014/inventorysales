package com.inventsale.inventorysales.controllers.general;

import java.util.ArrayList;
import java.util.List;

//import org.json.JSONArray;
//import org.json.JSONObject;
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

//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.databind.ObjectMapper;
import com.inventsale.inventorysales.DTO.BranchDTO;
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
	public ArrayList<BranchDTO> getAll(){
		List<Branch> branches = branchService.findAll();
		ArrayList<BranchDTO> branchesDTO= new ArrayList<BranchDTO>();
		BranchDTO branchDTO = new BranchDTO();
		for (Branch branch : branches) {
			branchDTO.setId(branch.getId());
			branchDTO.setTitle(branch.getTitle());
			branchDTO.setTitleAbbreviation(branch.getTitleAbreviation());
			branchDTO.setTelephone(branch.getTelephone());
			branchDTO.setOtherPhone(branch.getOtherPhone());
			branchDTO.setAddress(branch.getAddress());
			branchDTO.setCompanyId(branch.getCompanyId());
			branchDTO.setCompanyName(branch.getCompany().getCommercialName());
			branchesDTO.add(branchDTO);
		}
		return branchesDTO;
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
	public Branch deleteBranch(@PathVariable Integer id) {
		String msg = "Sucursal no encontrada";
		Branch result = branchService.findById(id);
		if (result.getId() ==null) {
			
			throw new RuntimeException(msg);			
		}
		branchService.deleteById(id);
		return result;
	}
		
	
	
	
}
