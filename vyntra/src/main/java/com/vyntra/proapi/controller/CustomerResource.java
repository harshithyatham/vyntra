package com.vyntra.proapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vyntra.proapi.model.Customer;
import com.vyntra.proapi.repository.CustomerRepo;

@RestController
@CrossOrigin(origins="*")
public class CustomerResource {
	@Autowired
	CustomerRepo cr;
	@GetMapping("/customer")
	public List<Customer> getcustomers()
	{
		return cr.findAll();
	}
	@PostMapping("/customer")
	public String createCustomer(@RequestBody Customer cust)
	{
		cr.save(cust);
		return "customer stored";
	}
	
}
