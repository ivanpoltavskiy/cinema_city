package com.project.cinema_city.dto.response;

import com.project.cinema_city.entity.Ticket;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.Set;

@Data
public class UserResponse {
    private Long id;
    private String email;
    private String name;
    private String lastName;
    private Date birthday;
    private Set<Ticket> ticket;
}
