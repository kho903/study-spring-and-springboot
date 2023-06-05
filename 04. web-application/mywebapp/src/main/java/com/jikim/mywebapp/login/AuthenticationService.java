package com.jikim.mywebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		boolean isValidUsername = username.equals("user");
		boolean isValidPassword = password.equals("12345");

		return isValidUsername && isValidPassword;
	}
}
