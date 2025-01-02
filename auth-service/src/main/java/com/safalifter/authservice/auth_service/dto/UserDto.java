package com.safalifter.authservice.auth_service.dto;

import com.safalifter.authservice.auth_service.enums.Role;
import lombok.Data;

@Data
public class UserDto {
    private String id;
    private String username;
    private String password;
    public Role role;
}
