package com.interview.wsd.payload;

import com.interview.wsd.model.Customer;
import com.interview.wsd.model.Product;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDTO {
    @NotBlank
    private Product product;
    @NotBlank
    private Customer customer;
}
