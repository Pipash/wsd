package com.interview.wsd.api;

import com.interview.wsd.component.ServiceResponse;
import com.interview.wsd.model.Order;
import com.interview.wsd.payload.OrderDTO;
import com.interview.wsd.service.OrderService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
@Slf4j
public class OrderApi {
    @Autowired
    OrderService orderService;

    @PostMapping("/add")
    public ResponseEntity<ServiceResponse> addOrder(@Valid @RequestBody OrderDTO orderDTO) {
        log.info("starting addOrder inside OrderApi to create an order");
        Order order = orderService.createOrder(orderDTO);
        return new ResponseEntity<>(new ServiceResponse("Order has been created!", order), HttpStatus.CREATED);
    }
}
