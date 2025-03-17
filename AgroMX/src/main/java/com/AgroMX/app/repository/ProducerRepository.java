package com.AgroMX.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.AgroMX.app.model.Producer;
import com.AgroMX.app.model.User;

public interface ProducerRepository extends CrudRepository<User, Long> {
	
	Optional<Producer> findByProducerName(String producerName);
	Optional<Producer> findByProducerId(Long id);
	//Iterable<Producer> findByProducerName(String producerName);}
	
	Iterable<Producer> findAllProducersByActiveTrue();
	
}
