package com.project.cinema_city.maper;

import com.project.cinema_city.dto.request.Ticket.TicketCreateRequest;
import com.project.cinema_city.dto.request.Ticket.TicketUpdateRequest;
import com.project.cinema_city.dto.response.TicketResponse;
import com.project.cinema_city.entity.Ticket;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface TicketMapper {
    TicketResponse toDto(Ticket entity);
    Ticket fromDto(TicketCreateRequest dto);
    Ticket fromDto(TicketUpdateRequest dto);
}
