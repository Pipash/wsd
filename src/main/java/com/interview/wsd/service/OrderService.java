package com.interview.wsd.service;

import com.interview.wsd.model.Order;
import com.interview.wsd.payload.OrderDTO;

public interface OrderService {
    Order createOrder(OrderDTO orderData);
}
