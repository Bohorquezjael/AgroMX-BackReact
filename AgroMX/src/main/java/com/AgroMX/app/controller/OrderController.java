package com.AgroMX.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.AgroMX.app.model.Order;
import com.AgroMX.app.service.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {
    
    @Autowired
    private OrderService orderService;
    
    @GetMapping("{id}")
    public ResponseEntity<Order> getOrder(@PathVariable("id") Long id){
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    @PostMapping("/")
    public ResponseEntity<Order> createOrder(@RequestBody Order orderInfo){
        return ResponseEntity.status(201).body(orderInfo);
    }
}
