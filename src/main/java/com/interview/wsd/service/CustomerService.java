package com.interview.wsd.service;

import com.interview.wsd.model.Customer;
import com.interview.wsd.payload.CustomerDTO;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer addCustomer(CustomerDTO customerData);

    Customer findCustomer(Integer id);
}
