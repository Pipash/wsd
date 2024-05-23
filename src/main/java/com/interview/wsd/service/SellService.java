package com.interview.wsd.service;

import com.interview.wsd.model.Order;
import com.interview.wsd.payload.DateRangeDTO;
import com.interview.wsd.payload.SingleDateDTO;

import java.util.List;

public interface SellService {
    Double saleAmountSingleDate(SingleDateDTO date);
    String maxSaleDay(DateRangeDTO dateRange);
    List<Order> topSellingItemsAllTime();
    List<Order> topSellingItemsLastMonth();
}
