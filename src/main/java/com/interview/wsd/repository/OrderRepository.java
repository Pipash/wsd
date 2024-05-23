package com.interview.wsd.repository;

import com.interview.wsd.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    @Query(nativeQuery = true, value = "select sum(price)")
}
