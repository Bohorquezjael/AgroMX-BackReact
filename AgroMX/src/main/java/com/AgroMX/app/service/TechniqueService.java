package com.AgroMX.app.service;

import com.AgroMX.app.model.Technique;

public interface TechniqueService {
	
	Technique createTechnique( Technique technique );
	
	Technique getTechniqueByTechniqueId( Long id );
	
	Technique getTechniqueByTechniqueName(String techniqueName );
	
	Technique updateTechnique( Technique technique, Long id );
	
	void deleteTechnique( Long id );
	
}
