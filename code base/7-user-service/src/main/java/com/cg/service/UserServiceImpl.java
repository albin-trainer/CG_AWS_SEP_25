package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.entity.User;
import com.cg.repo.UserRepository;
@Component
public class UserServiceImpl implements UserService {
	@Autowired
private UserRepository userRepo;
	
	@Override
	public User addNewUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public User searchById(int id) {
		User user=userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

}
