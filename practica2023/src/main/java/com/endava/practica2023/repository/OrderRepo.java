package com.endava.practica2023.repository;

import com.endava.practica2023.model.Event;
import com.endava.practica2023.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
    List<Order> findOrderByOrderID(Integer Id);
}
