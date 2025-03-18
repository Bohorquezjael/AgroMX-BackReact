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
		Optional<Producer> optionalProducer = producerRepository.findByProducerName(producer.getProducerName());
		if( optionalProducer.isPresent()) {
			throw new IllegalStateException("El productor" + producer.getProducerName() + "ya se ha registrado");
		}
		producer.setId(null);
		producer.setActive(true);
		Producer newProducer = producerRepository.save( producer );
		
		return newProducer;
	}

	@Override
	public Producer getProducerByProducerId(Long id) {
		Optional<Producer> existingProducer = producerRepository.findById(id);
		return existingProducer.orElseThrow(() -> new IllegalStateException("No existe el productor con el id " + id));
	}

	@Override
	public Producer getProducerByProducerName(String producerName) {
		Optional<Producer> existingProducer = producerRepository.findByProducerName(producerName);
		return existingProducer.orElseThrow( () -> new IllegalStateException("No existe el productor con nombre " + producerName));
	}

	@Override
	public Producer updateProducer(Producer producer, Long id) {
		Producer existingProducer = getProducerByProducerId(id);
		existingProducer.setProducerName( producer.getProducerName() );
		return producerRepository.save(existingProducer);
	}

	@Override
	public void deleteProducer(Long id) {
		Producer existingProducer = getProducerByProducerId(id);
		existingProducer.setActive(false);
		producerRepository.save(existingProducer);
		
	}

	
}
