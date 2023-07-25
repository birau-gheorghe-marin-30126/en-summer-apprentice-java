package com.endava.practica2023.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class EventDTO {
    private Integer id;
    private VenueDTO venue;
    private String eventTypeName;
    private String description;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private List<TicketCategoryDTO> ticketCategories;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public VenueDTO getVenue() {
        return venue;
    }

    public void setVenue(VenueDTO venue) {
        this.venue = venue;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public List<TicketCategoryDTO> getTicketCategories() {
        return ticketCategories;
    }

    public void setTicketCategories(List<TicketCategoryDTO> ticketCategories) {
        this.ticketCategories = ticketCategories;
    }
    public EventDTO(){

    }
    public EventDTO(Integer id, VenueDTO venue, String eventTypeName, String description, String name, LocalDateTime startDate, LocalDateTime endDate, List<TicketCategoryDTO> ticketCategories) {
        this.id = id;
        this.venue = venue;
        this.eventTypeName = eventTypeName;
        this.description = description;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.ticketCategories = ticketCategories;
    }
}
