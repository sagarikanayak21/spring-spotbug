package com.sn.spotbug.controler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sn.spotbug.dto.User;
import com.sn.spotbug.service.UserService;

@RestController
@RequestMapping(value = "/")
public class UserController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/{userId}/user")
	public String getUserDetails(@PathVariable String userId) {
		String userName = "abc";
		User getUsers = userService.getUser(userId);
		//if(null != getUsers) {
			return getUsers.toString();
		// }
		// return null;
	}
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
}