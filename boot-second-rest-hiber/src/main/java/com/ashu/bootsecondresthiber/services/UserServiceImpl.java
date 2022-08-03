package com.ashu.bootsecondresthiber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashu.bootsecondresthiber.model.User;
import com.ashu.bootsecondresthiber.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repo;
	
	@Override
	public boolean addUser(User user) {
		repo.save(user);
		return true;
	}

	@Override
	public boolean validateUser(String username, String password) {
		User user = repo.findById(username).get();
		if(password.equals(user.getPassword()))
			return true;
		else
			return false;
		//Good
	}

	@Override
	public List<User> allUsers() {
		return repo.findAll();
	}

}
