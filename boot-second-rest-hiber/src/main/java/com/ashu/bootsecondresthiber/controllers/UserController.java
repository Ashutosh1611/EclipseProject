package com.ashu.bootsecondresthiber.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.bootsecondresthiber.model.User;
import com.ashu.bootsecondresthiber.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userServ;
	
	@GetMapping("allUser")
	public List<User> allUser(){
		return userServ.allUsers();
	}
	
	@GetMapping("validate")
	public boolean validate(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {
		System.out.println("validate caleed from somehere*************************************");
		return userServ.validateUser(username, password);
	}
	
	@PostMapping("newUser")
	public boolean newUser(@RequestBody User user) {
		userServ.addUser(user);
		return true;
	}
}
