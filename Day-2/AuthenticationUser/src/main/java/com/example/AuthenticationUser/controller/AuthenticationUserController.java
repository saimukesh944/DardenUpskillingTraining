package com.example.AuthenticationUser.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.AuthenticationUser.entity.UserCredentials;

@RestController
public class AuthenticationUserController {
	

	    // Simulated user data (In real scenario, this would be fetched from a database)
	    private final String validUsername = "mukesh";
	    private final String validPassword = "mukesh123";

	    @PostMapping("/authenticate")
	    public String authenticateUser(@RequestBody UserCredentials credentials) {
	        if (credentials.getUsername().equals(validUsername) && credentials.getPassword().equals(validPassword)) {
	            return "Valid user";
	        } else {
	            return "Invalid user";
	        }
	    }
	}


