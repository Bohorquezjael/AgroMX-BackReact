package com.AgroMX.app.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.AgroMX.app.model.Order;
import com.AgroMX.app.repository.OrderRepository;
import com.AgroMX.app.service.OrderService;

@Service
public class OrderServiceImp implements OrderService{

    private Logger logger = LoggerFactory.getLogger(OrderServiceImp.class);
    private final OrderRepository orderRepository;

    public OrderServiceImp(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Optional<Order> createOrder(Order orderBody) {
         // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrder'");
    }

    @Override
    public Optional<Order> getOrder(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrder'");
    }

    @Override
    public Optional<Order> updateOrder(Long id, Order newOrderBody) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateOrder'");
    }

    @Override
    public Optional<Order> deleteOrder(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteOrder'");
    }

}

// TODO: validar si tenemos stock de los productos solicitados

// TODO: validar si la fecha de compra es actual/ valida

// TODO: implementar logica de negocio y excepciones personalizadas,
// posiblemente
// implementar loggin