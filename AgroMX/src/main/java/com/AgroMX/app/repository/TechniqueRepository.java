package com.AgroMX.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.AgroMX.app.model.Technique;

public interface TechniqueRepository extends CrudRepository<Technique, Long> {
	
}
