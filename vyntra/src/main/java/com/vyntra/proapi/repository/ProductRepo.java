package com.vyntra.proapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vyntra.proapi.model.Product;

public interface ProductRepo extends JpaRepository<Product,Long>{
	@Query("from Product p where p.category.category_name=?1")
	List<Product> findAllByCategory(String catname);

}
