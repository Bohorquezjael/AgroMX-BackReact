package com.AgroMX.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Techniques")
public class Technique {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name", length = 45, nullable = false)
	private String techniqueName;
	@Column(name = "description", length = 45, nullable = false)
	private String techniqueDescription;
	
	Technique(){}

	public Technique(Long id, String techniqueName, String techniqueDescription) {
		super();
		this.id = id;
		this.techniqueName = techniqueName;
		this.techniqueDescription = techniqueDescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTechniqueName() {
		return techniqueName;
	}

	public void setTechniqueName(String techniqueName) {
		this.techniqueName = techniqueName;
	}

	public String getTechniqueDescription() {
		return techniqueDescription;
	}

	public void setTechniqueDescription(String techniqueDescription) {
		this.techniqueDescription = techniqueDescription;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Technique [id=");
		builder.append(id);
		builder.append(", techniqueName=");
		builder.append(techniqueName);
		builder.append(", techniqueDescription=");
		builder.append(techniqueDescription);
		builder.append("]");
		return builder.toString();
	}
	
	
}
