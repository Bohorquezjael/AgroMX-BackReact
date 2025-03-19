package com.AgroMX.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.AgroMX.app.controller.ProductOrderController;
import com.AgroMX.app.model.ProductOrder;

@RestController
public class ProductOrderControllerImpl implements ProductOrderController {

    @Override
    public ResponseEntity<ProductOrder> getProductOrderById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductOrderById'");
    }

    @Override
    public ResponseEntity<ProductOrder> createProductOrder(ProductOrder newProductOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProductOrder'");
    }

    @Override
    public ResponseEntity<ProductOrder> updateProductOrder(ProductOrder productOrder, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProductOrder'");
    }

    @Override
    public ResponseEntity<Void> deleteProductOrder(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProductOrder'");
    }

}
