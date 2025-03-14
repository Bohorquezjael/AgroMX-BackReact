package com.AgroMX.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.AgroMX.app.model.User;

public interface CategoryRepository extends CrudRepository<User, Long> {

}
