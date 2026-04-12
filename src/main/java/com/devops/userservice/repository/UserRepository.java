package com.devops.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devops.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}