package com.interview.wsd.api;

import com.interview.wsd.component.ServiceResponse;
import com.interview.wsd.model.Customer;
import com.interview.wsd.payload.CustomerDTO;
import com.interview.wsd.service.CustomerService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
@Slf4j
public class CustomerApi {
    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public ResponseEntity<ServiceResponse> createCustomer(@Valid @RequestBody CustomerDTO customerDTO) {
        log.info("starting createCustomer inside CustomerApi to add a customer info");
        Customer customer = customerService.addCustomer(customerDTO);
        return new ResponseEntity<>(new ServiceResponse("new customer is created", customer), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceResponse> getCustomer(@PathVariable Integer id) {
        log.info("starting getCustomer inside CustomerApi to get a customer info");
        Customer customer = customerService.findCustomer(id);
        return new ResponseEntity<>(new ServiceResponse("customer information fetched", customer), HttpStatus.OK);
    }
}
