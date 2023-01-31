package com.anyang.wru.domain.image.controller;

import com.anyang.wru.domain.image.dto.mapper.UserDTO;
import com.anyang.wru.domain.image.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("")
    //*****CREAT*****
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
    @PutMapping("/{userid}")
    public void UpdateUserID(@PathVariable String userid, @RequestBody UserDTO user) {
        userService.UpdateUserID(userid, user);
    }

    //*****DELETE*****
    @DeleteMapping("/{userid}")
    public void deleteUserID(@PathVariable String userid) {
        userService.deleteUser(userid);
    }

}

