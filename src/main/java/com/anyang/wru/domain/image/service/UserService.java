package com.anyang.wru.domain.image.service;

import com.anyang.wru.domain.image.dto.mapper.UserDTO;
import com.anyang.wru.domain.image.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {
        @Autowired
        UserRepository userRepository; //userserive-userrepo의존성 설정

    //*****Create*****
    public UserDTO insertUser(UserDTO user){
        return userRepository.insertUser(user);
    }

    //Read 1.전체리스트 조회 2. 한 유저 조회
    //1
    public List<UserDTO> getAllUsers(){
        return UserRepository.getAllUsers();
    }
    //2
    public UserDTO getUserByUserID(String userid){ //2
        return UserRepository.getUserByUserID(userid);
    }

    //*****Update*****

    public void UpdateUserID(String userid, UserDTO user){
        userRepository.updateUserId(userid, user);
    }
    //*****DELETE*****
    public void deleteUser(String userid){
        UserRepository.deleteUser(userid);
    }
}
