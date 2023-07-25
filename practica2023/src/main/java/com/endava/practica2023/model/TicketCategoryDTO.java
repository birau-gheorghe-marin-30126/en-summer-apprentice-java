package com.endava.practica2023.model;

import jakarta.persistence.criteria.CriteriaBuilder;

public class TicketCategoryDTO {
    private Integer id;
    private String description;
    private long price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public TicketCategoryDTO(){

    }
    public TicketCategoryDTO(Integer id, String description, long price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }
}
