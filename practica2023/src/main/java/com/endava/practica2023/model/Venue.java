package com.endava.practica2023.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.*;
@Entity
@Table(name = "venues")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer venueID;

    @Column(name = "location")
    private String location;

    @Column(name = "type")
    private String type;

    @Column(name = "capacity")
    private long capacity;

    public Integer getVenueID() {
        return venueID;
    }

    public void setVenueID(Integer venueID) {
        this.venueID = venueID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public Venue(){
    }

    public Venue(String location, String type, long capacity) {
        this.location = location;
        this.type = type;
        this.capacity = capacity;
    }
}
