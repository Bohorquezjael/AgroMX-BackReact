package com.AgroMX.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AgroMX.app.model.Producer;
import com.AgroMX.app.model.User;

@Repository
public interface ProducerRepository extends CrudRepository<Producer, Long> {
	
	Optional<Producer> findByProducerName(String producerName);
	Optional<Producer> findById(Long id);
	//Iterable<Producer> findByProducerName(String producerName);}
	
	// Iterable<Producer> findAllProducersByActiveTrue();
	
}
