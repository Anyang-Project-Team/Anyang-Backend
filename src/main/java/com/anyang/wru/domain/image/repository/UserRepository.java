package com.anyang.wru.domain.image.repository;


import com.anyang.wru.domain.image.dto.mapper.UserDTO;
import com.anyang.wru.domain.user.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    //db연동코드 JPA

    static public ArrayList<UserDTO> users;

    static {
        users = new ArrayList<>(); //초기화
        users.add(new UserDTO("123", "park","test1@naver.com"));
        users.add(new UserDTO("456", "kim", "test2@gmail.com"));
        users.add(new UserDTO("789", "lee", "test3@daum.net" ));
    }
    //*****Create*****
    //유저 생성
    public UserDTO insertUser(UserDTO user){
        users.add(user);  //유저값 리스트 받아오기
        return user;
    }

    //*****Read*****
    //유저 읽기 1.전체리스트 조회 2. 한 유저 조회
    //1
    public static List<UserDTO> getAllUsers(){ //전체 유저 리스트 받아오기
        return users;
    }
    //2
    public static UserDTO getUserByUserID(String userid){
        return users.stream()
                .filter(userDTO -> userDTO.getUser_id().equals(userid) ) //userDTO의 id값 꺼내옴
                .findAny() //find
                 .orElse(new UserDTO("","","")); //없을 경우

    }
    //*****Update*****
    // 이메일 수정
    public void updateUserId(String userid, UserDTO user){
        users.stream()
                .filter(userDTO -> userDTO.getUser_id().equals(userid))
                .findAny()
                 .orElse(new UserDTO("","","")) //없을 경우
                .setUser_id(user.getEmail()); //이메일 변경
    }
    //*****Delete*****
    // 유저 삭제
    public static void deleteUser(String userid){
        users.removeIf(UserDTO -> UserDTO.getUser_id().equals(userid)); //userdto값에서 데이터 맞으면 삭제
    }

}

