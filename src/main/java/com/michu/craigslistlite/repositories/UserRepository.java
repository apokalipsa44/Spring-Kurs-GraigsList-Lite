package com.michu.craigslistlite.repositories;

import com.michu.craigslistlite.model.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
