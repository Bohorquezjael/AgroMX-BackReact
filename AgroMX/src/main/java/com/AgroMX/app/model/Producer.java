package com.AgroMX.app.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Producers")
public class Producer {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name", length = 45, nullable = false)
	private String producerName;
	@Column(name = "active")
	private boolean active;
	
	@ManyToMany()
	@JoinTable( // Define la tabla intermedia
			name="Producers_has_Techniques", // nombre de tabla intermedia
			joinColumns = @JoinColumn(name = "producer_id"),
			inverseJoinColumns = @JoinColumn(name = "technique_id")			
			)
	private Set<Technique> technique; // Colecciones de techniques de un productor
	
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
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set<Technique> getTechnique() {
		return technique;
	}

	public void setTechnique(Set<Technique> technique) {
		this.technique = technique;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producer [id=");
		builder.append(id);
		builder.append(", producerName=");
		builder.append(producerName);
		builder.append(", active=");
		builder.append(active);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
