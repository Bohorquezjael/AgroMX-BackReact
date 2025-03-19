package com.AgroMX.app.service;

import java.util.Optional;

import com.AgroMX.app.model.Order;

/** 
 * @author
 * @Bohorquezjael
*/

public interface OrderService {
    
    public Optional<Order> createOrder(Order orderBody);

    public Optional<Order> getOrder(Long id);

    public Optional<Order> updateOrder(Long id, Order newOrderBody);

    public void deleteOrder(Long id);

    //!TODO add method to get all orders
}
