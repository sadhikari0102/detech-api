package com.detechxify.webservice.UserMVC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	@Autowired
	private UserRepository users;

	//private List<User> users = new ArrayList<>();
	
	
	public List<UserModel> allUsers() {
		//User user = new User(1, "sadhikari0102", "mp211990", "snj211990@gmail.com");
		List<UserModel> allUsers = new ArrayList<>();
		users.findAll().forEach(allUsers::add);
		return allUsers;
	}
	
	public UserModel getUser(String username) {
		return users.findOne(username);
	}
	
	
	public void addUser(UserModel user) {
		users.save(user);
	}
	
	public void updateUser(UserModel user) {
		users.save(user);
	}
	
	public void deleteUser(String username) {
		users.delete(username);
	}
}
