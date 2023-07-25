package com.endava.practica2023.model;

import java.time.LocalDateTime;

public class OrderDTO {
    private Integer eventId;
    private LocalDateTime timestamp;
    private Integer ticketCategoryId;
    private long numberOfTickets;
    private long totalPrice;

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(Integer ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
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

    public OrderDTO(Integer eventId, LocalDateTime timestamp, Integer ticketCategoryId, long numberOfTickets, long totalPrice) {
        this.eventId = eventId;
        this.timestamp = timestamp;
        this.ticketCategoryId = ticketCategoryId;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }
}
