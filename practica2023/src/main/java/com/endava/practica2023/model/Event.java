package com.endava.practica2023.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventID;
    @ManyToOne
    //@MapsId("venue_id")
    @JoinColumn(name="venue_id")
    private Venue venueId;

    //@OneToMany(fetch = FetchType.EAGER, mappedBy = "eventId") // Cascade=all, orphanRemoval
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "eventId", orphanRemoval = true)
    @JsonIgnoreProperties("eventId")
    List<TicketCategory> listTicketCategory;

    public List<TicketCategory> getListTicketCategory() {
        return listTicketCategory;
    }

    public void setListTicketCategory(List<TicketCategory> listTicketCategory) {
        this.listTicketCategory = listTicketCategory;
    }

    @ManyToOne
    //@MapsId("event_type_id")
    @JoinColumn(name="event_type_id")
    private EventType eventTypeId;
    @Column(name = "event_description")
    private String eventDescription;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Venue getVenueId() {
        return venueId;
    }

    public void setVenueId(Venue venueId) {
        this.venueId = venueId;
    }

    public EventType getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(EventType eventTypeId) {
        this.eventTypeId = eventTypeId;
    }
    public Event(){
    }

    public Event(String eventDescription, String eventName, Date startDate, Date endDate, Venue venueId, EventType eventTypeId) {
        this.eventDescription = eventDescription;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.venueId = venueId;
        this.eventTypeId = eventTypeId;
    }
}
