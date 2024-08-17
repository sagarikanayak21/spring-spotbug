package com.sn.spotbug.service;

import com.sn.spotbug.dto.User;

public interface UserServiceI {
	public User getUser(String userId);
	public User saveUser(User user);
}