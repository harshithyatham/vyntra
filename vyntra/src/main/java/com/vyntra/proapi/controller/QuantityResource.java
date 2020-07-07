package com.vyntra.proapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.vyntra.proapi.repository.QuantityRepo;

@RestController
public class QuantityResource {
	@Autowired
	QuantityRepo qr;
	
	

}
