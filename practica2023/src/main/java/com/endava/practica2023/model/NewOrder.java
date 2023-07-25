package com.endava.practica2023.model;

public class NewOrder {
    Integer eventID;
    Integer ticketCategoryId;
    long numberOfTickets;

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
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

    public NewOrder(Integer eventID, Integer ticketCategoryId, long numberOfTickets) {
        this.eventID = eventID;
        this.ticketCategoryId = ticketCategoryId;
        this.numberOfTickets = numberOfTickets;
    }
}
