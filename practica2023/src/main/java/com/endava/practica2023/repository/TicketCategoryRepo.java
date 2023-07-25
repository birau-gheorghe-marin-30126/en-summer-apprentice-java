package com.endava.practica2023.repository;

import com.endava.practica2023.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketCategoryRepo extends CrudRepository<TicketCategory, Integer> {

}
