package com.vyntra.proapi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vyntra.proapi.model.Product;
import com.vyntra.proapi.repository.ProductRepo;

@RestController
public class ProductResource {
	@Autowired
	ProductRepo pr;
	
	@PostMapping("/product")
	public String createProduct(@RequestBody Product pro)
	{
		pr.save(pro);
		return "product created";
	}
	
	@GetMapping("/product")
	public List<Product> getProduct()
	{
		return this.pr.findAll();
		
	}
	
	@GetMapping("/product/{catname}")
	public List<Product> getproductbycat(@PathVariable String catname)
	{
		return pr.findAllByCategory(catname);
	}

}
