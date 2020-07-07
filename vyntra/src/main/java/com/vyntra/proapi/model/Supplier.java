package com.vyntra.proapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {
	@Id
	private int sid;
	private String name;
	private String adress;
	private long phone;
	public Supplier() {
		
	}

	public Supplier(int sid, String name, String adress, long phone) {
		super();
		this.sid = sid;
		this.name = name;
		this.adress = adress;
		this.phone = phone;
	}


	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	

}
