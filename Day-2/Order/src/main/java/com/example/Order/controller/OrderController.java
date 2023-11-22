package com.example.Order.controller;

import com.example.Order.model.OrderDetails;
import com.example.Order.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping("/add")
    public String addOrder(@RequestBody OrderDetails order){
        return service.addOrder(order);
    }
    @GetMapping("/getAll")
    public List<OrderDetails> getAll(){
        return service.getAll();
    }
    @GetMapping("/get/{id}")
    public OrderDetails getById(@PathVariable int id){
        return service.getById(id);

    }
    @PutMapping("/update/{id}")
    public String updateOrder( @PathVariable int id,@RequestBody OrderDetails order){
        return service.updateOrder(id,order);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteOrder(@PathVariable int id)
    {
        return service.deleteOrder(id);
    }
}
