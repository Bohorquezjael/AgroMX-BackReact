package com.AgroMX.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.AgroMX.app.model.Order;

/***
     * 
     * @param orderBody
     * @return ResponseEntity<Order> 
     * @throws Exception
     * @Bohorquezjael
     * @apiNote TODO implement own exceptions
     */

    public interface OrderController {

    public ResponseEntity<Order> createOrder(@RequestBody Order orderBody) throws Exception;

    public ResponseEntity<Order> getOrder(@PathVariable("id") Long id);

    public ResponseEntity<Order> updateOrder(@PathVariable("id") Long id, @RequestBody Order orderBody);

    public ResponseEntity<Order> deleteOrder(@PathVariable("id") Long id);
}
