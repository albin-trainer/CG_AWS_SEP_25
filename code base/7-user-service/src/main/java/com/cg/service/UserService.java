package com.cg.service;

import java.util.List;


import com.cg.entity.User;

public interface UserService {
	public User addNewUser(User user);
	public User searchById( int id);
	public List<User> getAllUsers();

}
