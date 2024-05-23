package com.interview.wsd.service.serviceImpl;

import com.interview.wsd.model.Order;
import com.interview.wsd.payload.DateRangeDTO;
import com.interview.wsd.payload.SingleDateDTO;
import com.interview.wsd.repository.OrderRepository;
import com.interview.wsd.service.SellService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SellServiceImpl implements SellService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public Double saleAmountSingleDate(SingleDateDTO date) {
        //Double amount = orderRepository
        return null;
    }

    @Override
    public String maxSaleDay(DateRangeDTO dateRange) {
        return null;
    }

    @Override
    public List<Order> topSellingItemsAllTime() {
        return null;
    }

    @Override
    public List<Order> topSellingItemsLastMonth() {
        return null;
    }
}
