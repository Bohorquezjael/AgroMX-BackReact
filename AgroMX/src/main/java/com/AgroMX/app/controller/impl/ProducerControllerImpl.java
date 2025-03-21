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

import com.AgroMX.app.controller.ProducerController;
import com.AgroMX.app.model.Producer;
import com.AgroMX.app.service.ProducerService;

@CrossOrigin("*")
@RequestMapping("/producers")
@RestController
public class ProducerControllerImpl implements ProducerController {
	
	private final ProducerService producerService;
	
	public ProducerControllerImpl(ProducerService producerService) {
		this.producerService = producerService;
	}

	@Override
	@GetMapping("{id}")
	public ResponseEntity<Producer> getProducerByProducerId(@PathVariable("id") Long id) {
		return ResponseEntity.ok(producerService.getProducerByProducerId(id));
	}

	@Override
	@PostMapping
	public ResponseEntity<Producer> createProducer(@RequestBody Producer newProducer) {
		return ResponseEntity.status(201).body(producerService.createProducer(newProducer));
	}

	@Override
	@PutMapping("{id}")
	public ResponseEntity<Producer> updateProducer(@RequestBody Producer producer, @PathVariable Long id) {
		return ResponseEntity.ok(producerService.updateProducer(producer, id));
	}

	@Override
	@DeleteMapping("{id}")
	public ResponseEntity<Void> deleteProducer(@PathVariable Long id) {
		producerService.deleteProducer(id);
		return ResponseEntity.noContent().build();
	}
	
}
