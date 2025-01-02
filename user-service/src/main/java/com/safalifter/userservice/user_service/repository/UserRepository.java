package com.safalifter.userservice.user_service.repository;

import com.safalifter.userservice.user_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
}
