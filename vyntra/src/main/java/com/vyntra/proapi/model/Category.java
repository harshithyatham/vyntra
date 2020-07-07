package com.vyntra.proapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	private long catid;
	private String category_name;
	
	
	public Category() {
		
	}
	public Category(long catid, String category_name) {
		super();
		this.catid = catid;
		this.category_name = category_name;
	}
	public long getCatid() {
		return catid;
	}
	public void setCatid(long catid) {
		this.catid = catid;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	

}
