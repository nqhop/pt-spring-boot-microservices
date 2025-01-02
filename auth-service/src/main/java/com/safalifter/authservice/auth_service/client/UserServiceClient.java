package com.safalifter.authservice.auth_service.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user-service", path = "/v1/user")
public class UserServiceClient {

}
