package com.detechxify.webservice.ApplicationMVC;

import java.time.Duration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.detechxify.webservice.UserMVC.UserModel;

@Entity
public class ApplicationModel {
	
	@Id
	String name;
	Duration duration ;
	@ManyToOne
	UserModel user;
		
	public ApplicationModel() {

	}
	
	public ApplicationModel(String name, Duration duration) {
		this.name = name;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}
	
}
