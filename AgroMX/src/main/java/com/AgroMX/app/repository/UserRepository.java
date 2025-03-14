package com.AgroMX.app.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import com.AgroMX.app.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	

}
