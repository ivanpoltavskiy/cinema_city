package com.project.cinema_city.service;

import com.project.cinema_city.entity.Ticket;
import com.project.cinema_city.exception.TicketNotFoundException;
import com.project.cinema_city.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TicketService {
    private TicketRepository ticketRepository;

    public List<Ticket> tickets() {
        return ticketRepository.findAll();
    }

    public Ticket getById(Long id) {
        return ticketRepository.findById(id).orElseThrow(() -> new TicketNotFoundException("Ticket not found"));
    }

    public Ticket add(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Ticket update(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public void deleteByID(Long id) {
        ticketRepository.deleteById(id);
    }
}
