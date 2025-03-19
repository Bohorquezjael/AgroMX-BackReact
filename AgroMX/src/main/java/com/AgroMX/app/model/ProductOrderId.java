package com.AgroMX.app.model;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductOrderId implements Serializable {
    private Long orderId;
    private Long productId;
}