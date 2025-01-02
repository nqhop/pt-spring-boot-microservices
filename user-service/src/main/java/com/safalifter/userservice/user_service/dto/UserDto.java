package com.safalifter.userservice.user_service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.safalifter.userservice.user_service.model.UserDetails;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {
    private String id;
    private String username;
    private String email;
    private UserDetails userDetails;
}
