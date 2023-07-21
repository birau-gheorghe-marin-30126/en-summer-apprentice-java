package com.endava.practica2023.controller;

import com.endava.practica2023.model.Order;
import com.endava.practica2023.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/GET_orders")
    public List<Order> getOrderList(@RequestParam Integer id){
        return orderService.getOrderById(id);
    }
}
