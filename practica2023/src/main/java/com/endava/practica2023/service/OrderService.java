package com.endava.practica2023.service;

import com.endava.practica2023.model.Event;
import com.endava.practica2023.model.Order;
import com.endava.practica2023.model.TicketCategory;
import com.endava.practica2023.repository.EventRepo;
import com.endava.practica2023.repository.OrderRepo;
import com.endava.practica2023.repository.TicketCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepo orderRepository;
    @Autowired
    public OrderService(OrderRepo orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrderById(Integer Id){
        return orderRepository.findOrderByOrderID(Id);
    }

}
