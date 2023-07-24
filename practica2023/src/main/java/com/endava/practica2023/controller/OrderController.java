package com.endava.practica2023.controller;

import com.endava.practica2023.model.*;
import com.endava.practica2023.repository.OrderRepo;
import com.endava.practica2023.repository.TicketCategoryRepo;
import com.endava.practica2023.repository.UserRepo;
import com.endava.practica2023.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    private final OrderService orderService;
    private User user;

    @Autowired
    private UserRepo userRepo;
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/GET_orders")
    public List<Order> getOrderList(@RequestParam Integer id){
        return orderService.getOrderById(id);
    }

    @Autowired
    private TicketCategoryRepo ticketCategoryRepo;

    @Autowired
    private OrderRepo orderRepo;
    @PostMapping("/POST_orders")
    public UsefulInfo postOrder(@RequestBody NewOrder newOrder){
        LocalDateTime localDateTime= LocalDateTime.now();
        TicketCategory ticketCategory= ticketCategoryRepo.findById(newOrder.getTicketCategoryId()).get();
        this.user=new User();
        User user2=userRepo.findById(1).get();

        System.out.println(user2);

        Order order = new Order(localDateTime, newOrder.getNumberOfTickets(), newOrder.getNumberOfTickets()*ticketCategory.getPrice(),
                user2, ticketCategory);
        Order order2 = orderRepo.save(order);
        return orderService.usefulInfo(order2);
    }
}
