package com.example.Order.service;

import com.example.Order.model.OrderDetails;
import com.example.Order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository repository;

    @Override
    public List<OrderDetails> getAll() {
        return repository.findAll();
    }

    @Override
    public OrderDetails getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public String addOrder(OrderDetails order) {
        repository.save(order);
        return "Order added Successfully";
    }

    @Override
    public String updateOrder(int id, OrderDetails order) {
        Optional<OrderDetails> container = repository.findById(id);
        if (container.isPresent()) {
            OrderDetails c = container.get();
            c.setProductName(order.getProductName());
            c.setQuantity(order.getQuantity());
            repository.save(c);
            return "OrderDetails Updated";
        } else {
            return "OrderDetails not Found";
        }

    }

    @Override
    public String deleteOrder(int id) {
        Optional<OrderDetails> container = repository.findById(id);
        if (container.isPresent()) {
            OrderDetails c = container.get();

            repository.delete(c);
            return "OrderDetails Deleted";
        } else {
            return "OrderDetails not Found";
        }

    }
}