package com.project.cinema_city.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    @OneToOne
    private Film film;
    @OneToOne
    private CinemaHall hall;
    @ManyToMany
    private Set<User> users;
}
