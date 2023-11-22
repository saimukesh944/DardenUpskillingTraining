package com.example.Order.repository;

import com.example.Order.model.OrderDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderDetails,Integer> {
}
