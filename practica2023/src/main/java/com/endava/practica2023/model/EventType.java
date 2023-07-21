package com.endava.practica2023.model;

import jakarta.persistence.*;

@Entity
@Table (name = "event_types")
public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventTypeID;

    @Column(name = "event_type_name")
    private String eventTypeName;

    public Integer getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(Integer eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public EventType(){
    }

    public EventType(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }
}
