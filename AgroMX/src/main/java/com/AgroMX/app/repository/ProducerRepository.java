package com.AgroMX.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AgroMX.app.model.Producer;

@Repository
public interface ProducerRepository extends CrudRepository<Producer, Long> {
	
	Optional<Producer> findByProducerName(String producerName);
	Optional<Producer> findByProducerId( Long id );
	//Iterable<Producer> findByProducerName(String producerName);}
	
	// Iterable<Producer> findAllProducersByActiveTrue();
	
}
