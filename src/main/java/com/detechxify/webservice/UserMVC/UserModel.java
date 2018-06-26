package com.detechxify.webservice.UserMVC;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModel {
	@Id
	String username;
	String password;
	String email;
		
	public UserModel() {

	}

	public UserModel(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
/*	
	public UserModel(UserModel user) {
		this.username = user.username;
		this.password = user.password;
		this.email = user.email;
	}*/
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
