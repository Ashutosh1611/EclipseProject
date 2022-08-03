package com.ashu.bootsecondresthiber.services;

import java.util.List;

import com.ashu.bootsecondresthiber.model.User;

public interface UserService {
	
	public boolean addUser(User user);
	public boolean validateUser(String username,String password);
	public List<User> allUsers();
	
}
