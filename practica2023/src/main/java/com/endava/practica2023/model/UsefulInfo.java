package com.endava.practica2023.model;

import java.time.LocalDateTime;

public class UsefulInfo {
    private Integer eventID;
    private LocalDateTime orderedAt;
    private long numberOfTickets;
    private long totalPrice;

    private Integer ticketCategory;

    public Integer getEventID() {
        return eventID;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public long getNumberOfTickets() {
        return numberOfTickets;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public void setNumberOfTickets(long numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public UsefulInfo(Integer eventID, LocalDateTime orderedAt, long numberOfTickets, long totalPrice, Integer ticketCategory) {
        this.eventID = eventID;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
        this.ticketCategory = ticketCategory;
    }
}
