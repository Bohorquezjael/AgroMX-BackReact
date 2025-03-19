package com.AgroMX.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AgroMX.app.model.Technique;

@Repository
public interface TechniqueRepository extends CrudRepository<Technique, Long> {
	
	// Optional<Technique> findByTechniqueId( Long id );
	Optional<Technique> findByTechniqueName( String techniqueName );
	
}
