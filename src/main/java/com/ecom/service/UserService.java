package com.ecom.service;

import com.ecom.model.User;

public interface UserService {

	//add user details
	public User addUserDetails(User user);
	
	// to update existing user details
	public User updateUserDetails(Integer id, User user);
	
	//to delete user 
	public void deleteUser(Integer id);
}
