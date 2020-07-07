package com.vyntra.proapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vyntra.proapi.model.Customer;


public interface CustomerRepo extends JpaRepository<Customer,Long> {
	Optional<Customer> findByusername(String username);

}
