package com.rein.repo;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rein.model.User;

public interface UserRepository extends JpaRepository<User, Serializable>{

	static Optional<User> findByName(String username) ;

	
}
