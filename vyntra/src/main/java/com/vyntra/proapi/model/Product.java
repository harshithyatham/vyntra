package com.vyntra.proapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	private long pid;
	private String name;
	private long stock;
	private int price;
	@ManyToOne
	@JoinColumn(name="catid")
	private Category category;
	@ManyToOne
	@JoinColumn(name="supplier_id")
	private Supplier supplier;
	public Product() {
		super();
	}
	public Product(long pid, String name, long stock, int price, Category category, Supplier supplier) {
		super();
		this.pid = pid;
		this.name = name;
		this.stock = stock;
		this.price = price;
		this.category = category;
		this.supplier = supplier;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getStock() {
		return stock;
	}
	public void setStock(long stock) {
		this.stock = stock;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
