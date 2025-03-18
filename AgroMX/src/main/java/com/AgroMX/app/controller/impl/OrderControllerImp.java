package com.AgroMX.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.AgroMX.app.controller.OrderController;
import com.AgroMX.app.model.Order;
import com.AgroMX.app.service.impl.OrderServiceImp;

@Controller
@RequestMapping("/order")
public class OrderControllerImp implements OrderController {

    private final OrderServiceImp orderService;

    public OrderControllerImp(OrderServiceImp orderService) {
        this.orderService = orderService;
    }

    @Override
    @PostMapping()
    public ResponseEntity<Order> createOrder(@RequestBody Order orderBody) throws Exception {
        return orderService.createOrder(orderBody)
                .map(order -> ResponseEntity.status(201).body(order))
                .orElseGet(() -> ResponseEntity.status(400).build());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable Long id) {
        return orderService.getOrder(id)
                .map(orderId -> ResponseEntity.ok(orderId))
                .orElseGet(() -> ResponseEntity.status(404).build());
    }

    @Override
    @PutMapping("{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable Long id, @RequestBody Order newOrderBody) {
        return orderService.updateOrder(id, newOrderBody)
                .map(order -> ResponseEntity.status(202).body(order))
                .orElseGet(() -> ResponseEntity.status(404).build());
    }

    @Override
    @DeleteMapping("{id}")
    public ResponseEntity<Order> deleteOrder(@PathVariable Long id) {
        return ResponseEntity.status(204).build();
    }

}