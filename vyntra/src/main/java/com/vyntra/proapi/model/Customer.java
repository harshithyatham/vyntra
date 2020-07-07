package com.vyntra.proapi.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long cid;
	private String username;
	private String name;
	private String email;
	private int phone;
	private String password;
	private boolean active;
	private String roles;
	

	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(long cid, String username, String name, String email, int phone, String password, boolean active,
			String roles) {
		super();
		this.cid = cid;
		this.username = username;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.active = active;
		this.roles = roles;
	}

	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
