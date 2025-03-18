package com.AgroMX.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AgroMX.app.controller.TechniqueController;
import com.AgroMX.app.model.Technique;
import com.AgroMX.app.service.TechniqueService;

@CrossOrigin(origins = "*")
@RequestMapping("/producers")
@RestController
public class TechniqueControllerImpl implements TechniqueController{
	
	private final TechniqueService techniqueService;
	
	public TechniqueControllerImpl( TechniqueService techniqueService) {
		this.techniqueService = techniqueService;
	}

	@Override
	@GetMapping("{id}")
	public ResponseEntity<Technique> getTechniqueByTechniqueId(@PathVariable("id") Long id) {
		return ResponseEntity.ok(techniqueService.getTechniqueByTechniqueId(id));
	}

	@Override
	@PostMapping("{id}")
	public ResponseEntity<Technique> createTechnique(@RequestBody Technique newTechnique) {
		return ResponseEntity.status(201).body(techniqueService.createTechnique(newTechnique));
	}

	@Override
	@PutMapping("{id}")
	public ResponseEntity<Technique> updateTechnique(@RequestBody Technique technique, @PathVariable("{id}") Long id) {
		return ResponseEntity.ok(techniqueService.updateTechnique(technique, id));
	}

	@Override
	@DeleteMapping("{id}")
	public ResponseEntity<Void> deleteTechnique(@PathVariable("{id}") Long id) {
		techniqueService.deleteTechnique(id);
		return ResponseEntity.noContent().build();
	}

	
}
