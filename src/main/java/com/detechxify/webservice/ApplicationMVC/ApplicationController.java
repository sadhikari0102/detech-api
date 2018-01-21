package com.detechxify.webservice.ApplicationMVC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApplicationController {
	
	@Autowired
	private ApplicationService service;

	@RequestMapping("/users/{username}/applications")
	public List<ApplicationModel> getAllApplications(@PathVariable("username") String username) {
		return service.allApplications(username);
	}
	
	@RequestMapping("/users/{username}/applications/{applicationId}")
	public ApplicationModel getApplication(@PathVariable("applicationId") String appId) {
		return service.getApplication(appId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users/{userId}/applications")
	public void addApplication(@RequestBody ApplicationModel application) {
		service.addApplication(application);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users/{username}/applications/{applicationId}")
	public void updateApplication(@RequestBody ApplicationModel application) {
		service.updateApplication(application);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{username}/applications/{applicationId}")
	public void deleteApplication(@PathVariable("applicationId") String applicationId) {
		service.deleteApplication(applicationId);
	}
	
}
