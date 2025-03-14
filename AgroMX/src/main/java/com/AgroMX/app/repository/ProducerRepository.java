package com.AgroMX.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.AgroMX.app.model.User;

public interface ProducerRepository extends CrudRepository<User, Long> {

}
