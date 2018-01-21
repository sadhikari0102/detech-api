package com.detechxify.webservice.ApplicationMVC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ApplicationService {
	
	@Autowired
	private ApplicationRepository applications;

	//private List<User> users = new ArrayList<>();
	
	
	public List<ApplicationModel> allApplications(String username) {
		//User user = new User(1, "sadhikari0102", "mp211990", "snj211990@gmail.com");
		List<ApplicationModel> allapps = new ArrayList<>();
		applications.findByUsername(username).forEach(allapps::add);
		return allapps;
	}
	
	public ApplicationModel getApplication(String name) {
		return applications.findOne(name);
	}
	
	
	public void addApplication(ApplicationModel application) {
		applications.save(application);
	}
	
	public void updateApplication(ApplicationModel application) {
		applications.save(application);
	}
	
	public void deleteApplication(String name) {
		applications.delete(name);
	}
}
