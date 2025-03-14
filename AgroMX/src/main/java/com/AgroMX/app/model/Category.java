package com.AgroMX.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Categories")
public class Category {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name", length = 45, nullable = false)
	private String categoryName;
	@Column(name = "description", length = 300, nullable = false, unique = true)
	private String categoryDescription;
	@Column(name = "url_image", length = 300, nullable = false)
	private String categoryUrlImage;
	
	Category(){}

	public Category(Long id, String categoryName, String categoryDescription, String categoryUrlImage) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.categoryUrlImage = categoryUrlImage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public String getCategoryUrlImage() {
		return categoryUrlImage;
	}

	public void setCategoryUrlImage(String categoryUrlImage) {
		this.categoryUrlImage = categoryUrlImage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Category [id=");
		builder.append(id);
		builder.append(", categoryName=");
		builder.append(categoryName);
		builder.append(", categoryDescription=");
		builder.append(categoryDescription);
		builder.append(", categoryUrlImage=");
		builder.append(categoryUrlImage);
		builder.append("]");
		return builder.toString();
	}
	
	

}
