package com.vyntra.proapi.model;

public class AuthorizationRequest {
	private String username;
	private String password;
	public AuthorizationRequest() {
		super();
	}
	public AuthorizationRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
