package com.endava.practica2023.model;

public class VenueDTO {
    private Integer id;
    private String name;
    private String location;
    private long capacity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }
    public VenueDTO(){

    }

    public VenueDTO(Integer id, String name, String location, long capacity) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }
}
