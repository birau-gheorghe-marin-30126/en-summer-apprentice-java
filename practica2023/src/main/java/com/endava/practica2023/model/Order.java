package com.endava.practica2023.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderID;

    /*@Column(name = "user_id")
    private long userId;

    @Column(name = "ticket_category_id")
    private String ticketCategoryId;*/
    @ManyToOne
    @MapsId("user_id")
    private User userId;

    @ManyToOne
    @MapsId("ticket_category_id")
    private TicketCategory ticketCategoryId;
    @Column(name = "ordered_at")
    private LocalDateTime orderedAt;

    @Column(name = "number_of_tickets")
    private long numberOfTickets;

    @Column(name = "total_price")
    private long totalPrice;

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public long getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(long numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public TicketCategory getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(TicketCategory ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }
    public Order(){
    }

    public Order(LocalDateTime orderedAt, long numberOfTickets, long totalPrice, User userId, TicketCategory ticketCategoryId) {
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
        this.userId = userId;
        this.ticketCategoryId = ticketCategoryId;
    }

    /*public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }*/
}
