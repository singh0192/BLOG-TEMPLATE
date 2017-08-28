package com.rein.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rein.model.User;
import com.rein.repo.LoginRepo;
import com.rein.service.LoginService;

@Service
public class LoginServiceImpl  implements LoginService{

	@Autowired
	private LoginRepo loginRepo;

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return loginRepo.login(username,password);
	}

}
