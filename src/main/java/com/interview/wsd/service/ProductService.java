package com.interview.wsd.service;

import com.interview.wsd.model.Product;
import com.interview.wsd.payload.ProductDTO;

public interface ProductService {
    Product createProduct(ProductDTO productData);
}
