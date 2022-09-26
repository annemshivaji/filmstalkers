package com.group1.springboot.stalkers.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("shivaji");
		boolean isValidPassword = password.equalsIgnoreCase("8");
		
		return isValidUserName && isValidPassword;
	}
}