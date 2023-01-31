package com.anyang.wru.domain.image.controller;

import com.anyang.wru.domain.image.dto.mapper.UserDTO;
import com.anyang.wru.domain.image.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Refactor코드를 수정해서 너한테 보내주는거!
@RequestMapping("/users") // LocalHost:8080 -> /localhost:8080/users -> 유저 홈페이지 접속
public class UserController {

    private final UserService; // -> final Return 값이 절대 안바뀜 -> Private -> Protected -> public
    // ->A -> 어떤 이유때문인지 -> B가 A한테 간섭을하넹 -> A는 User -> B때문에 A가 변경 -> 문제가 생기잖아 -
    //Private -> final -> UserService

    @PostMapping("") // -> PostMapping -> Get, Delete, Post -> Get 받아오는거 Post 보내는거 Delete지우는거
    //*****CREAT*****  //PostMapping을 통해서 보내줄것이다 -> Post 보내다
                        //GetMapping
                      //DeleteMapping ->
    public UserDTO insertUser(@RequestBody UserDTO user){
        return userService.insertUser(user);
    }
    //*****READ*****
    //1
    @GetMapping("")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }
    //2
    @GetMapping("/{userid}")
    public UserDTO getUserById(@PathVariable String userid) {
        return userService.getUserByUserID(userid);
    }
    //*****UPDATE*****
    @PutMapping("/{userid}")//값 a=1 -> Update -> 데이터 변경 -> 이런거 -> PutMapping
    public void UpdateUserID(@PathVariable String userid, @RequestBody UserDTO user) {
        userService.UpdateUserID(userid, user);
    }

    //*****DELETE*****
    @DeleteMapping("/{userid}")
    public void deleteUserID(@PathVariable String userid) {
        userService.deleteUser(userid);
    }

}

