package com.AgroMX.app.controller;

import org.springframework.http.ResponseEntity;

import com.AgroMX.app.model.Producer;

public interface ProducerController {
	
	ResponseEntity< Producer > getProducerByProducerId( Long id );
	
	ResponseEntity< Producer > createProducer( Producer newProducer );
	
	ResponseEntity< Producer > updateProducer( Producer producer, Long id);
	
	ResponseEntity< Void > deleteProducer( Long id );
}
