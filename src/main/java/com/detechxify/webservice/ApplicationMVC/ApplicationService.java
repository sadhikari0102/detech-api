package com.detechxify.webservice.ApplicationMVC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.detechxify.webservice.UserMVC.UserRepository;


@Service
public class ApplicationService {
	
	@Autowired
	private ApplicationRepository applications;
	private UserRepository users;
	
	
	public List<ApplicationModel> allApplications(String username) {
		List<ApplicationModel> allapps = new ArrayList<>();
		applications.findByUsername(username).forEach(allapps::add);
		return allapps;
	}
	
	public ApplicationModel getApplication(String user, String name) {
		return applications.findOne(name);
	}
	
	
	public void addApplication(String user, ApplicationModel application) {
		if(users.findOne(user)!=null) {
			application.setUser(user);
			applications.save(application);
		}
	}
	
	public void updateApplication(String user, ApplicationModel application) {
		if(users.findOne(user)!=null) {
			application.setUser(user);
			applications.save(application);
		}
	}
	
	public void deleteApplication(String name) {
		applications.delete(name);
	}
}
