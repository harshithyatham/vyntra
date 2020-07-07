package com.vyntra.proapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vyntra.proapi.model.Supplier;

public interface SupplierRepo extends JpaRepository<Supplier,Integer> {

}
