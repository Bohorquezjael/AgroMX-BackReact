package com.AgroMX.app.controller;

import org.springframework.http.ResponseEntity;

import com.AgroMX.app.model.Technique;

public interface TechniqueController {
	
	ResponseEntity< Technique > getTechniqueByTechniqueId( Long id );
	
	ResponseEntity< Technique > createTechnique( Technique newTechnique );
	
	ResponseEntity< Technique > updateTechnique( Technique technique, Long id);
	
	ResponseEntity< Void > deleteTechnique( Long id );
	
}
