package com.rein.repo.impl;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rein.model.User;
import com.rein.repo.LoginRepo;

@Repository
public class LoginRepoImpl implements LoginRepo{

	private final Logger logger = Logger.getLogger("LoginRepoImpl.class");
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public User login(String username, String password) {
		User user;
		String SQL = "select id,username,dob,phone,address,email,role from tbl_user where username=:username and password=:password ;";
	try{
		 user = (User) namedParameterJdbcTemplate.queryForObject(SQL, new MapSqlParameterSource("username", username)
				.addValue("password", password), new BeanPropertyRowMapper(User.class));
	}catch(EmptyResultDataAccessException e ){
		logger.severe("EmptyResultDataAccessException"); 
		user=new User();
	}catch(Exception e){
		e.printStackTrace();
		logger.severe("Exception");
		user=new User();
	}
		
		return user;
	}

}
