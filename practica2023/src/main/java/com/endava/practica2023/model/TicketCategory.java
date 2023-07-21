package com.endava.practica2023.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ticket_categorys")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketCategoryID;

   // @Column(name = "event_id")
  //  private long eventId;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private long price;

    public Integer getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(Integer ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Event getEventId() {
        return eventId;
    }

    public void setEventId(Event eventId) {
        this.eventId = eventId;
    }
    @ManyToOne
    @MapsId("event_id")
    private Event eventId;
    public TicketCategory(){
    }

    public TicketCategory(long price, Event eventId) {
        this.description = description;
        this.price = price;
        this.eventId = eventId;
    }
}
