package com.detechxify.webservice.UserMVC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	@Autowired
	private UserService service;

	@RequestMapping("/users")
	public List<UserModel> getAllUsers() {
		return service.allUsers();
	}
	
	@RequestMapping("/users/{username}")
	public UserModel getUser(@PathVariable("username") String username) {
		return service.getUser(username);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users")
	public void addUser(@RequestBody UserModel user) {
		service.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users/{username}")
	public void updateUser(@RequestBody UserModel user) {
		service.updateUser(user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{username}")
	public void deleteUser(@PathVariable("username") String username) {
		service.deleteUser(username);
	}
	
}
