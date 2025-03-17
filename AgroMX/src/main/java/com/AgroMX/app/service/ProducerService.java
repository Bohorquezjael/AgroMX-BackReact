package com.AgroMX.app.service;

import com.AgroMX.app.model.Producer;

public interface ProducerService {
	
	Producer createProducer( Producer producer );
	Producer getProducerById( Long id );
	Producer getProducerByProducerName( String producerName );
	Iterable<Producer> getAllProducers();
	Producer updateProducer(Producer producer, Long id);
	void deleteProducer( Long id );
}
