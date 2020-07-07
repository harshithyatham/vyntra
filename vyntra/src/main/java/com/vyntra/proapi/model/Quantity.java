package com.vyntra.proapi.model;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Quantity {
	@Id
	@GeneratedValue()
	private int qid;
	private int quantity;
	@OneToOne
	private Product product;
	@OneToMany
	private List<Customer> customer;
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	public Quantity(int qid, int quantity, Product product, List<Customer> customer) {
		super();
		this.qid = qid;
		this.quantity = quantity;
		this.product = product;
		this.customer = customer;
	}
	public Quantity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
