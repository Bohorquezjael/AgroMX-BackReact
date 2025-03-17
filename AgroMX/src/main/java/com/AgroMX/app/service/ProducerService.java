package com.AgroMX.app.service;

import com.AgroMX.app.model.Producer;

public interface ProducerService {
	Producer createProducer( Producer producer );
	//Producer createProducer(Producer producer, String techniqueId);
	Producer getProducerById( Long id );
	Producer getProducerByName( String producerName );
	Producer updateProducer(Producer producer, Long id);
	void deleteProducer( Long id );
}
