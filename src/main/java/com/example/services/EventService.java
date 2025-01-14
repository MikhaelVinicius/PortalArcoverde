package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Event;
import com.example.repositories.EventRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    // Retorna todos os eventos
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    // Busca um evento pelo ID
    public Optional<Event> getEventById(Long id) {
        return eventRepository.findById(id);
    }

    // Adiciona ou atualiza um evento
    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    // Remove um evento pelo ID
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}