package com.AgroMX.app.model;

import jakarta.persistence.*;
import lombok.*;

	@Entity
	@Table(name = "Products")
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class Product {

		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "product_name", length = 100, nullable = false)
		private String productName;
		
		@Column(name = "price", length = 100, nullable = true)
		private Double price;
		
		@Column(name = "unit", length = 10, nullable = false)
		private String unit;
		
		@Column(name = "stock", length = 50, nullable = false, unique = true)
		private Long stock;
		
		@ManyToOne
		@JoinColumn(name = "category_id", nullable = false)
		private Category CategoryId;
		
		@Column(name = "description", length = 1000, nullable = false)
		private String description;

		@Column(name = "benefits", length = 1000, nullable = false)
		private String benefits;

		@ManyToOne
		@JoinColumn(name = "producer_id", nullable = false)
		private Producer producer;

		

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Product [id=");
			builder.append(id);
			builder.append(", productName=");
			builder.append(productName);
			builder.append(", stock=");
			builder.append(stock);
			builder.append(", description=");
			builder.append(description);
			builder.append(", benefits=");
			builder.append(benefits);
			builder.append("]");
			return builder.toString();
		}
}	

