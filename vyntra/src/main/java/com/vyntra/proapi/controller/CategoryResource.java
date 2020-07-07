package com.vyntra.proapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vyntra.proapi.model.Category;
import com.vyntra.proapi.repository.CategoryRepo;

@RestController
public class CategoryResource {
	@Autowired
	CategoryRepo cr;

	@PostMapping("/category")
	public String createCategory(@RequestBody Category cat)
	{
		cr.save(cat);
		return "category created";
	}
	@GetMapping("/category")
	public List<Category> getCategory()
	{
		return this.cr.findAll();
	}
}
