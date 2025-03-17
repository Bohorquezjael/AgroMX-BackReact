package com.AgroMX.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ProblemDetail;
import org.springframework.stereotype.Service;

import com.AgroMX.app.model.Order;
import com.AgroMX.app.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // TODO: validar si tenemos stock de los productos solicitados

    // TODO: validar si la fecha de compra es actual/ valida

    public Order getOrderById(Long id) {
        // TODO: implementar logica de negocio y excepciones personalizadas,
        // posiblemente
        // implementar loggin

        return orderRepository.findById(id).orElseThrow();
    }

    public Order createOrder(Order orderInfo) throws Exception{
        Order order = orderInfo;
        if(!orderInfo.validateFields()){
            throw new Exception("Invalid fields");
        }
        return orderRepository.save(order);
    }
}
