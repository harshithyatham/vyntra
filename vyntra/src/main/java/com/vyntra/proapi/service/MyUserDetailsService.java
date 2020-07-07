package com.vyntra.proapi.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vyntra.proapi.model.Customer;
import com.vyntra.proapi.repository.CustomerRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	CustomerRepo cr;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Customer> user=cr.findByusername(username);
		user.orElseThrow(() -> new UsernameNotFoundException("not found : "+username));
		return user.map(com.vyntra.proapi.model.MyUserDetails::new).get();
	}

}
