package com.project.cinema_city.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String  password;
    private String name;
    private String lastName;
    private Date birthday;
    @ManyToMany
    @JoinColumn(name = "ticket_id")
    private Set<Ticket> ticket;
}
