package com.vyntra.proapi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vyntra.proapi.model.Supplier;
import com.vyntra.proapi.repository.SupplierRepo;



@RestController
@CrossOrigin(origins="*")
public class SupplierResource {
	@Autowired
	SupplierRepo sr;
	
	@PostMapping("/supplier")
	public String createSupplier(@RequestBody Supplier sup)
	{
		sr.save(sup);
		return "Supplier saved";
	}
	
	@GetMapping("/supplier")
	public List<Supplier> getSupplier()
	{
		return this.sr.findAll();
	}

}
