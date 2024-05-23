package com.interview.wsd.service.serviceImpl;

import com.interview.wsd.model.Product;
import com.interview.wsd.payload.ProductDTO;
import com.interview.wsd.repository.ProductRepository;
import com.interview.wsd.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public Product createProduct(ProductDTO productData) {
        log.info("Starting createProduct inside ProductServiceImpl to create a product");
        return productRepository.save(new Product(productData.getName(), productData.getPrice()));
    }
}
