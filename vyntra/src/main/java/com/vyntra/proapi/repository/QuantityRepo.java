package com.vyntra.proapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vyntra.proapi.model.Quantity;

public interface QuantityRepo extends JpaRepository<Quantity,Integer>{


}
