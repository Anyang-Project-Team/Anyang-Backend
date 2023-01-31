package com.anyang.wru.domain.user.service;

import com.anyang.wru.domain.user.dto.mapper.UserMapper;
import com.anyang.wru.domain.user.dto.request.UserRequest;
import com.anyang.wru.domain.user.entity.User;
import com.anyang.wru.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository USER_REPOSITORY;
    private final UserMapper USER_MAPPER;

    @Transactional
    public User save(UserRequest userRequest) {
        return USER_REPOSITORY.save(USER_MAPPER.saveDataToEntity(userRequest));
    }


}
