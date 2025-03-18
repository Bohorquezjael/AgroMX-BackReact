package com.AgroMX.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.AgroMX.app.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByEmail(String email);
	

} 
