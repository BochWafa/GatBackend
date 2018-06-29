package com.insat.wafa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insat.wafa.repositories.AssuranceUserRepository;
import com.insat.wafa.entities.AssuranceUser;

@RestController
public class AssuranceUserController {
@Autowired
	private AssuranceUserRepository aur;
	
	@GetMapping(value="/AssuranceUser/all")
	public List<AssuranceUser> getAll() {
		return aur.findAll();
	}
	
	@GetMapping(value="/AssuranceUser/{id}")
	public AssuranceUser getAssUser(@PathVariable Long id) {
		return aur.findOne(id);
	}
	@PostMapping(value="/AssuranceUser/create")
	public void createAssUser(@RequestBody AssuranceUser a) {
		aur.save(a);
	}
	
	@DeleteMapping(value="/AssuranceUser/{id}")
	public void deleteAssUser(@PathVariable Long id) {
		AssuranceUser au = aur.findOne(id);
		aur.delete(au);
		}
	
	@PutMapping(value="/AssuranceUser/{id}")
	public void updateAssUser(@PathVariable Long id, @RequestBody AssuranceUser ar) {
		AssuranceUser au = aur.findOne(id);
		ar.setIdAssuranceUser(id);
		aur.save(ar);

	}
	
}
