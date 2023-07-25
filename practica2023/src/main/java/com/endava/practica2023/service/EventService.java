package com.endava.practica2023.service;

import com.endava.practica2023.model.*;
import com.endava.practica2023.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventService {

    private final EventRepo eventRepository;

    @Autowired
    public EventService(EventRepo eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getEventByVenueIdAndEventType(Integer Id, String eventName){
        return eventRepository.findEventByVenueId_VenueIDAndEventTypeId_EventTypeName(Id, eventName);
    }

    public EventDTO convertEventToEventDTO(Event event) {
        EventDTO eventDTO = new EventDTO();
        eventDTO.setId(event.getEventID());

        EventType eventType = event.getEventTypeId();
        if (eventType != null) {
            eventDTO.setEventTypeName(eventType.getEventTypeName());
        }

        eventDTO.setDescription(event.getEventDescription());
        eventDTO.setName(event.getEventName());
        eventDTO.setStartDate(event.getStartDate());
        eventDTO.setEndDate(event.getEndDate());

        VenueDTO venueDTO = new VenueDTO();
        venueDTO.setId(event.getVenueId().getVenueID());
        venueDTO.setLocation(event.getVenueId().getLocation());
        venueDTO.setCapacity(event.getVenueId().getCapacity());
        eventDTO.setVenue(venueDTO);

        List<TicketCategoryDTO> ticketCategories = event.getListTicketCategory()
                .stream()
                .map(this::convertTicketCategoryToDTO)
                .collect(Collectors.toList());
        eventDTO.setTicketCategories(ticketCategories);

        return eventDTO;
    }

    private TicketCategoryDTO convertTicketCategoryToDTO(TicketCategory ticketCategory) {
        TicketCategoryDTO ticketCategoryDTO = new TicketCategoryDTO();
        ticketCategoryDTO.setId(ticketCategory.getTicketCategoryID());
        ticketCategoryDTO.setDescription(ticketCategory.getDescription());
        ticketCategoryDTO.setPrice(ticketCategory.getPrice());
        return ticketCategoryDTO;
    }

    public List<EventDTO> getAllEventsDTO(Integer venueId, String eventName) {
        List<Event> listEvent = eventRepository.findEventByVenueId_VenueIDAndEventTypeId_EventTypeName(venueId, eventName);

        return listEvent.stream().map(this::convertEventToEventDTO).toList();
    }
}
