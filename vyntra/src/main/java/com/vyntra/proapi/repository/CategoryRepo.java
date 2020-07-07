package com.vyntra.proapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vyntra.proapi.model.Category;

public interface CategoryRepo extends JpaRepository<Category,Long> {

}
