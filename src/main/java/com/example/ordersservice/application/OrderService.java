package com.example.ordersservice.application;

import com.example.ordersservice.dto.OrderDto;
import com.example.ordersservice.entity.Order;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);

    OrderDto getOrderByOrderId(String orderId);

    Iterable<Order> getOrdersByUserId(String userId);
}
