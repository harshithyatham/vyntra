package com.vyntra.proapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class FacebookUserResource {
	 @GetMapping
	    public Principal getUser(Principal user) {
	        return user;
	    }
}
