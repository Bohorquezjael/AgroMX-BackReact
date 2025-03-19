package com.AgroMX.app.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.AgroMX.app.model.Technique;
import com.AgroMX.app.repository.TechniqueRepository;
import com.AgroMX.app.service.TechniqueService;

@Service
public class TechniqueServiceImpl implements TechniqueService{
	
	private final TechniqueRepository techniqueRepository;
	
	public TechniqueServiceImpl(TechniqueRepository techniqueRepository) {
		this.techniqueRepository = techniqueRepository;
	}

	@Override
	public Technique createTechnique(Technique technique) {
		Optional<Technique> optionalTechnique = techniqueRepository.findByTechniqueName(technique.getTechniqueName());
		if( optionalTechnique.isPresent()) {
			throw new IllegalStateException("La técnica " + technique.getTechniqueName() + " ya existe.");
		}
		technique.setId(null);
		Technique newTechnique = techniqueRepository.save( technique ); 
		return newTechnique;
	}

	@Override
	public Technique getTechniqueByTechniqueId(Long id) {
		Optional<Technique> optionalTechnique = techniqueRepository.findByTechniqueId(id);
		if( optionalTechnique.isEmpty()) {
			throw new IllegalStateException("La técnica con id " + id + " no existe.");
		}
		Technique existingTechnique = optionalTechnique.get();
		return existingTechnique;
	}

	@Override
	public Technique getTechniqueByTechniqueName(String techniqueName) {
		Optional<Technique> optionalTechnique = techniqueRepository.findByTechniqueName(techniqueName);
		if( optionalTechnique.isEmpty()) {
			throw new IllegalStateException("La técnica " + techniqueName + "no existe.");
		}
		Technique existingTechnique = optionalTechnique.get();
		return existingTechnique;
	}

	@Override
	public Technique updateTechnique(Technique technique, Long id) {
		Technique existingTechnique = getTechniqueByTechniqueId( id );
		existingTechnique.setTechniqueName( technique.getTechniqueName() );
		existingTechnique.setTechniqueDescription( technique.getTechniqueDescription() );
		
		return techniqueRepository.save( existingTechnique );
	}

	@Override
	public void deleteTechnique(Long id) {
		Technique existingTechnique = getTechniqueByTechniqueId( id );
		existingTechnique.setActive(false);
		techniqueRepository.save(existingTechnique);
		
	}
	

}
