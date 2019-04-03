package com.et.gis.ejemplo.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.et.gis.ejemplo.security.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
