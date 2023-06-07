package com.ecom.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.User;
import com.ecom.repository.UserRepository;
import com.ecom.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	//injecting UserRepository reference 
	@Autowired
	private UserRepository userRepository;
	
	//Service for addUserDetails
	@Override
	public User addUserDetails(User user) {
		User user2=userRepository.save(user);
		return user2;
	}

	//service for updateUserDetails
	@Override
	public User updateUserDetails(Integer id, User user) {
		Optional<User> user1=userRepository.findById(id);
		User oldUser=user1.get();
		oldUser.setUserName(user.getUserName());
		return userRepository.save(oldUser);
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
		
	}

}
