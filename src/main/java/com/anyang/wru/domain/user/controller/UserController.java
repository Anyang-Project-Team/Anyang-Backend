package com.anyang.wru.domain.user.controller;

import com.anyang.wru.domain.user.dto.mapper.UserMapper;
import com.anyang.wru.domain.user.dto.request.UserRequest;
import com.anyang.wru.domain.user.dto.response.UserResponse;
import com.anyang.wru.domain.user.entity.User;
import com.anyang.wru.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService USER_SERVICE;
    private final UserMapper USER_MAPPER;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse createUser(@RequestBody UserRequest userRequest) {
        User insertUserResult = USER_SERVICE.save(userRequest);
        return USER_MAPPER.getDataFromEntity(insertUserResult);
    }

}


