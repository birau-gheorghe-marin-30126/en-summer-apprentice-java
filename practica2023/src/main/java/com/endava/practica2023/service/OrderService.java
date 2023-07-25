package com.endava.practica2023.service;

import com.endava.practica2023.model.*;
import com.endava.practica2023.repository.OrderRepo;
import com.endava.practica2023.repository.TicketCategoryRepo;
import com.endava.practica2023.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepo orderRepository;
    @Autowired
    public OrderService(OrderRepo orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDTO convertOrderToOrderDTO(Order order){
        return new OrderDTO(order.getTicketCategoryId().getEventId().getEventID(), order.getOrderedAt(), order.getTicketCategoryId().getTicketCategoryID(),
                        order.getNumberOfTickets(), order.getTotalPrice());
    }

    private User user;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private TicketCategoryRepo ticketCategoryRepo;

    @Autowired
    private OrderRepo orderRepo;
    public OrderDTO postOrder(NewOrder newOrder) {
        LocalDateTime localDateTime = LocalDateTime.now();
        TicketCategory ticketCategory = ticketCategoryRepo.findById(newOrder.getTicketCategoryId()).get();
        User user = userRepo.findById(1).get();

        Order order = new Order(localDateTime, newOrder.getNumberOfTickets(), newOrder.getNumberOfTickets() * ticketCategory.getPrice(),
                user, ticketCategory);

        Order savedOrder = orderRepo.save(order);
        return convertOrderToOrderDTO(savedOrder);
    }

    public List<OrderDTO> getAllOrdersDTO(Integer userId) {
        List<Order> listOrder = orderRepo.findOrdersByUserId_UserID(userId);

        return listOrder.stream().map(this::convertOrderToOrderDTO).toList();
    }
}
