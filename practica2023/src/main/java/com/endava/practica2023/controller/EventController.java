package com.endava.practica2023.controller;

import com.endava.practica2023.model.Event;
import com.endava.practica2023.model.EventDTO;
import com.endava.practica2023.model.OrderDTO;
import com.endava.practica2023.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EventController {
    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/events")
    public List<EventDTO> getEvetDTOList(@RequestParam Integer venueId, @RequestParam String eventName){
        return  eventService.getAllEventsDTO(venueId, eventName);
    }
}