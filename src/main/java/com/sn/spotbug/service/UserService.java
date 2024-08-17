package com.sn.spotbug.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sn.spotbug.dto.User;
import com.sn.spotbug.repository.UserRepository;



@Service
public class UserService implements UserServiceI {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User getUser(String userId) {
		Optional<User> users =  userRepository.findById(userId);
		if(users.isPresent()) {
			System.out.println("User: " +users);
			return users.get();
		}
		return null;
	}

	@Override
	public User saveUser(User user ) {
		User saveUser = userRepository.save(user);
		return saveUser;
	}

}