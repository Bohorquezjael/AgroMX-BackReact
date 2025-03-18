package com.AgroMX.app.service.impl;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.AgroMX.app.Exceptions.OrderException;
import com.AgroMX.app.model.Order;
import com.AgroMX.app.model.ProductOrder;
import com.AgroMX.app.repository.OrderRepository;
import com.AgroMX.app.service.OrderService;

@Service
public class OrderServiceImp implements OrderService {

    private Logger log = LoggerFactory.getLogger(OrderServiceImp.class);
    private final OrderRepository orderRepository;

    public OrderServiceImp(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Optional<Order> createOrder(Order orderBody) {
        Optional<Order> orderFind = orderRepository.findById(orderBody.getId());

        if (orderFind.isPresent()) {
            log.error("Order already exists with id: " + orderBody.getId());
            return Optional.empty();
        }
        if(orderBody.getDateTime() != LocalDateTime.now()) {
            log.error("Order has a date different from now");
            throw new OrderException("Cant create a order with a date different from now");
        }
        validateOrderFields(orderBody);

        return Optional.of(orderRepository.save(orderBody));
    }

    @Override
    public Optional<Order> getOrder(Long id) {
        Optional<Order> orderFind = orderRepository.findById(id);
        if (orderFind.isEmpty()) {
            log.error("Order not found with id: " + id);
            return Optional.empty();
        }

        return orderFind;
    }

    @Override
    public Optional<Order> updateOrder(Long id, Order newOrderBody) {
        Optional<Order> orderFind = this.getOrder(id);
        
        if (orderFind.isEmpty()) {
            log.error("Order not found with id: " + id);
            return Optional.empty();
        }
        validateOrderFields(newOrderBody, orderFind.get());
        orderFind = updateFields(newOrderBody);
        return this.createOrder(orderFind.get());
    }

    @Override
    public void deleteOrder(Long id) {
        this.getOrder(id).orElseThrow(() -> {
            log.error("Order cant be deleted " + id);
            throw new OrderException("Order cant be deleted because doesnt exists" + id);
        });
        orderRepository.deleteById(id);
    }

    private void validateOrderFields(Order order, Order orderFind) {
        if(order.getProducts().isEmpty() || !validateStock(order.getProducts())) {
            log.error("Order has no products");
            throw new OrderException("Cant create a order without products");
        }

        if(order.getTotal() < 0) {
            log.error("Order has a negative total");
            throw new OrderException("Cant create a order with negative total");
        }

        if(order.getDateTime() == null || isDateBeetwenWeek(order.getDateTime(), orderFind.getDateTime())) {
            log.error("Order has no date");
            throw new OrderException("Cant create a order without date");
        }

        if(order.getUserId() == null) {
            log.error("Order has no user");
            throw new OrderException("Cant create a order without user");
        }
    }

    private void validateOrderFields(Order order) {
        if(order.getProducts().isEmpty() || !validateStock(order.getProducts())) {
            log.error("Order has no products");
            throw new OrderException("Cant create a order without products");
        }

        if(order.getTotal() < 0) {
            log.error("Order has a negative total");
            throw new OrderException("Cant create a order with negative total");
        }

        if(order.getDateTime() == null) {
            log.error("Order has no date");
            throw new OrderException("Cant create a order without date");
        }

        if(order.getUserId() == null) {
            log.error("Order has no user");
            throw new OrderException("Cant create a order without user");
        }
    }

    private boolean isDateBeetwenWeek(LocalDateTime before, LocalDateTime now) {
        return before.isBefore(now.minusWeeks(1)) || before.isAfter(now.plusWeeks(1));
    }

    private boolean validateStock(Set<ProductOrder> products){
        return products.stream()
                .anyMatch(product -> product.getQuantity() > product.getProductId().getStock());
    }

    private Optional<Order> updateFields(Order newOrderBody) {
        return Optional.of(new Order(
            newOrderBody.getId(), 
            newOrderBody.getUserId(), 
            newOrderBody.getTotal(), 
            newOrderBody.getDateTime(), 
            newOrderBody.getProducts()));
    }
}