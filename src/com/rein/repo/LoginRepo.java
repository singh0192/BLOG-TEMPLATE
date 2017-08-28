package com.rein.repo;

import java.util.Optional;

import com.rein.model.User;

public interface LoginRepo {
	
	public User login(String username, String password);
	
	

}
