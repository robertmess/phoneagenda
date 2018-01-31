package com.robert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robert.entity.User;
import com.robert.service.PhoneBookService;

@RestController 
@RequestMapping("/user")
public class UserController {

	private final PhoneBookService phoneBookService;
	
	@Autowired
	public UserController(PhoneBookService phoneBookService) {
		this.phoneBookService = phoneBookService;
	}
	
	@GetMapping("/getAll")
	public List<User> getAllUser() throws Exception {
		return phoneBookService.getAllUsers();
	}
	
	@GetMapping("/add/{userName}") 
	public void addNewUser(@PathVariable String userName) throws Exception {
		phoneBookService.addNewUser(userName);
	}
	
	@DeleteMapping("/remove/{userName}")
	public void removeUser(@PathVariable String userName) throws Exception {
		phoneBookService.removeUser(userName);
	}
}
