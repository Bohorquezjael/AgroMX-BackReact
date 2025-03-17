package com.AgroMX.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Producers")
public class Producer {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name", length = 45, nullable = false)
	private String producerName;
	
	Producer(){}

	public Producer(Long id, String producerName) {
		super();
		this.id = id;
		this.producerName = producerName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producer [id=");
		builder.append(id);
		builder.append(", producerName=");
		builder.append(producerName);
		builder.append("]");
		return builder.toString();
	}
	
	
}
