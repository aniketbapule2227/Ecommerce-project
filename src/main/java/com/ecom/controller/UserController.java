package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.User;
import com.ecom.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	//create rest api to save user data into database.
	//task 43
	@PostMapping("/saveUser")
	public ResponseEntity<User>saveUserDetails(@RequestBody User user){
		User user3=userService.addUserDetails(user);
		return ResponseEntity.ok().body(user3);
	}
	
	// create rest api to update user details
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<User>updateUser(@PathVariable Integer id,@RequestBody User user){
		User user2=userService.updateUserDetails(id, user);
		return ResponseEntity.ok().body(user2);
	}
	
	// create rest api to delete user
	
	@DeleteMapping("/deleteUserbyId/{id}")
	public ResponseEntity<User>deleteUser(@PathVariable Integer id){
		userService.deleteUser(id);
		return ResponseEntity.ok().body(null);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
