package com.anyang.wru.domain.user.dto.mapper;

import com.anyang.wru.domain.user.dto.request.UserRequest;
import com.anyang.wru.domain.user.dto.response.UserResponse;
import com.anyang.wru.domain.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {
    public User saveDataToEntity(UserRequest userRequest) {
        return User.builder()
                .email(userRequest.getEmail())
                .build();
    }

    public UserResponse getDataFromEntity(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .email(user.getEmail())
                .build();
    }

}
