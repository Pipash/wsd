package com.interview.wsd.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    @NotBlank
    private Product product;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    @NotBlank
    private Customer customer;

    @NotBlank
    private Double price;

    @NotBlank
    private Date orderDate;

    public Order(Product product, Customer customer, Double price){
        this.product = product;
        this.customer = customer;
        this.price = price;
    }
}
