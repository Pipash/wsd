package com.interview.wsd.api;

import com.interview.wsd.component.ServiceResponse;
import com.interview.wsd.model.Product;
import com.interview.wsd.payload.ProductDTO;
import com.interview.wsd.service.ProductService;
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
@RequestMapping("/api/product")
@Slf4j
public class ProductApi {
    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<ServiceResponse> addProduct(@Valid @RequestBody ProductDTO productDTO) {
        log.info("starting addProduct inside ProductApi to create a product");
        Product product = productService.createProduct(productDTO);
        return new ResponseEntity<>(new ServiceResponse("Product has been created!", product), HttpStatus.CREATED);
    }
}
