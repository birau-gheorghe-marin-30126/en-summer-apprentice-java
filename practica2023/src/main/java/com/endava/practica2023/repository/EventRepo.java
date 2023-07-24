package com.endava.practica2023.repository;

import com.endava.practica2023.model.Event;
import com.endava.practica2023.model.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EventRepo extends JpaRepository<Event, Integer> {
    List<Event> findEventByVenueId_VenueIDAndEventTypeId_EventTypeName(Integer Id, String eventName);

//    @Query("SELECT e.eventID, o.orderedAt, o.ticketCategory.ticketCategoryID, o.numberOfTickets, o.totalPrice " +
//            "FROM Event e " +
//            "JOIN e.orders o " +
//            "WHERE e.eventID = :eventId AND o.ticketCategory.ticketCategoryID = :ticketCategoryId " +
//            "AND o.numberOfTickets = :numberOfTickets")
//    List<Object[]> findEventOrderDetails(
//            Long eventId,
//            Long ticketCategoryId,
//            Long numberOfTickets
//    );
}
