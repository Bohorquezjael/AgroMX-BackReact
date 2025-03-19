package com.AgroMX.app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ProductOrder")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductOrder {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_order_id", nullable = false)
    private Long id;

    
    private Product productId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order orderId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "amount_sold")
    private Double amountForProduct;
}
