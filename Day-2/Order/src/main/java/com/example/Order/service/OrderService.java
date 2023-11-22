package com.example.Order.service;

import com.example.Order.model.OrderDetails;

import java.util.List;

public interface OrderService {
    public List<OrderDetails> getAll();
    public OrderDetails getById(int id);
    public String addOrder(OrderDetails order);
    public String updateOrder(int id,OrderDetails order);
    public String deleteOrder(int id);

}
