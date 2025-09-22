package com.cg.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.User;
import com.cg.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;
	@PostMapping
	public User addNewUser(@RequestBody  User user) {
		return service.addNewUser(user);
	}
	@GetMapping("/{id}")
	public User searchById(@PathVariable("id")  int id) {
		return service.searchById(id);
	}
	@GetMapping
	public List<User> getAllUsers(){
		return service.getAllUsers();
	}
}
