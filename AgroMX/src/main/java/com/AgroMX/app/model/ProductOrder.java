package com.AgroMX.app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ProductOrder")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductOrder {

    @EmbeddedId
    private ProductOrderId id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "amount_sold")
    private Double amountForProduct;
}
