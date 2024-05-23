package com.interview.wsd.service.serviceImpl;

import com.interview.wsd.model.Order;
import com.interview.wsd.payload.OrderDTO;
import com.interview.wsd.repository.OrderRepository;
import com.interview.wsd.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order createOrder(OrderDTO orderData) {
        log.info("Starting createOrder inside OrderServiceImpl to create a order");
        return orderRepository.save(new Order(orderData.getProduct(), orderData.getCustomer(), orderData.getPrice()));
    }
}
