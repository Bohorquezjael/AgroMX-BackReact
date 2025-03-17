package com.AgroMX.app.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.AgroMX.app.model.Producer;
import com.AgroMX.app.repository.ProducerRepository;
import com.AgroMX.app.service.ProducerService;


@Service
public class ProducerServiceImpl implements ProducerService {
	
	private final ProducerRepository producerRepository;
	
	public ProducerServiceImpl(ProducerRepository producerRepository) {
		this.producerRepository = producerRepository;
	}

	@Override
	public Producer createProducer(Producer producer) {
		// TODO
		return null;
	}

	@Override
	public Producer getProducerById(Long id) {
		Optional<Producer> existingProducer = producerRepository.findByProducerId(id);
		return existingProducer.orElseThrow(() -> new IllegalStateException("No existe el productor con el id " + id));
	}

	@Override
	public Producer getProducerByProducerName(String producerName) {
		Optional<Producer> existingProducer = producerRepository.findByProducerName(producerName);
		return existingProducer.orElseThrow( () -> new IllegalStateException("No existe el productor con nombre " + producerName));
	}

	@Override
	public Producer updateProducer(Producer producer, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProducer(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<Producer> getAllProducers() {
		return producerRepository.findAllProducersByActiveTrue();
	}
	
}
