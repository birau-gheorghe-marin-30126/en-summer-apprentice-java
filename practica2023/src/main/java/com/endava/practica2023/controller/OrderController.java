package com.endava.practica2023.controller;

import com.endava.practica2023.model.*;
import com.endava.practica2023.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    private final OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public List<OrderDTO> getOrderDTOList(@RequestParam Integer user_id){
        return orderService.getAllOrdersDTO(user_id);
    }
    @PostMapping("/orders")
    public OrderDTO postOrder(@RequestBody NewOrder newOrder){
        return orderService.postOrder(newOrder);
    }
}
