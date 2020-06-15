package com.neo.mcfront.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.neo.dubbo.frame.bean.User;
import com.neo.dubbo.interfaces.UserService;

@RestController
public class UserController {

	@Reference
	UserService<User> userService;
	
	@GetMapping("/user/{userid}")
	public String checkUserExists(
			@PathVariable(name = "userid") Integer userId
			) {
		
		boolean rs = userService.checkUserExists(userId);
		if(rs) {
			return "find it";			
		}
		return "not find it";
		
	}
}
