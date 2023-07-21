package com.endava.practica2023.service;

import com.endava.practica2023.model.Event;
import com.endava.practica2023.model.EventType;
import com.endava.practica2023.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
