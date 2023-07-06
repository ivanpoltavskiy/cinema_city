package com.project.cinema_city.repository;

import com.project.cinema_city.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Repository> {
}
