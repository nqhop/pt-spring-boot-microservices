package com.safalifter.userservice.user_service.service;

import com.safalifter.userservice.user_service.enums.Active;
import com.safalifter.userservice.user_service.enums.Role;
import com.safalifter.userservice.user_service.exc.NotFoundException;
import com.safalifter.userservice.user_service.model.User;
import com.safalifter.userservice.user_service.repository.UserRepository;
import com.safalifter.userservice.user_service.request.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
//    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    public User saveUser(RegisterRequest request){
        User userToSave = User.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .email(request.getEmail())
                .role(Role.USER)
                .active(Active.ACTIVE).build();
        return userRepository.save(userToSave);
    }
    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return findUserById(id);
    }

    protected User findUserById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new NotFoundException("User not found with ID: " + id));
    }
}
