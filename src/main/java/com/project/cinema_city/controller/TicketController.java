package com.project.cinema_city.controller;

import com.project.cinema_city.dto.request.Ticket.TicketCreateRequest;
import com.project.cinema_city.dto.request.Ticket.TicketUpdateRequest;
import com.project.cinema_city.dto.response.TicketResponse;
import com.project.cinema_city.maper.TicketMapperImpl;
import com.project.cinema_city.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/ticket")
public class TicketController {
    private TicketService ticketService;
    private TicketMapperImpl ticketMapper;

    @GetMapping
    public List<TicketResponse> tickets() {
        return ticketService.tickets().stream().map(ticketMapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public TicketResponse getById(@Valid @PathVariable Long id) {
        return ticketMapper.toDto(ticketService.getById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<TicketResponse> add(@Valid @RequestBody TicketCreateRequest ticketCreateRequest) {
        return new ResponseEntity<>(ticketMapper.toDto(ticketService.add(ticketMapper.fromDto(ticketCreateRequest))), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<TicketResponse> update(@Valid @RequestBody TicketUpdateRequest ticketCreateRequest) {
        return new ResponseEntity<>(ticketMapper.toDto(ticketService.update(ticketMapper.fromDto(ticketCreateRequest))), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        ticketService.deleteByID(id);
    }

}
