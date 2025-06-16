package com.talktoa.userservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talktoa.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom query methods here if needed

    List<User> findByTopicsIsNotEmpty();
}