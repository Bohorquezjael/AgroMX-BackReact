package com.AgroMX.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AgroMX.app.model.ProductOrder;
import com.AgroMX.app.repository.ProductOrderRepository;
import com.AgroMX.app.service.ProductOrderService;

@Service
public class ProductOrderServiceImpl implements ProductOrderService {

    private final ProductOrderRepository productOrderRepository;

    ProductOrderServiceImpl(ProductOrderRepository productOrderRepository){
        this.productOrderRepository = productOrderRepository;
    }

    @Override
    public ProductOrder createProductOrder(ProductOrder productOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProductOrder'");
    }

    @Override
    public ProductOrder getProductOrderById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductOrderById'");
    }

    @Override
    public void deleteProductOrder(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProductOrder'");
    }

    @Override
    public ProductOrder updateProductOrder(ProductOrder productOrder, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProductOrder'");
    }
    
}