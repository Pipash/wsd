package com.interview.wsd.service.serviceImpl;

import com.interview.wsd.exceptions.APIException;
import com.interview.wsd.model.Customer;
import com.interview.wsd.payload.CustomerDTO;
import com.interview.wsd.repository.CustomerRepository;
import com.interview.wsd.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer addCustomer(CustomerDTO customerData) {
        log.info("Starting addCustomer inside CustomerServiceImpl to create a customer");
        Customer customer = new Customer();
        customer.setName(customerData.getName());
        return customerRepository.save(customer);
    }

    @Override
    public Customer findCustomer(Integer id) {
        log.info("Starting findCustomer inside CustomerServiceImpl to get a customer details");
        return customerRepository.findById(id).orElseThrow(()-> new APIException("Data not found!"));
    }
}
