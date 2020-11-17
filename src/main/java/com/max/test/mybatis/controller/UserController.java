package com.max.test.mybatis.controller;

import com.max.test.mybatis.entity.User;
import com.max.test.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id") Long userId){
        return userService.getUser(userId);
    }

    @DeleteMapping("/{id}")
    public Integer deleteUserById(@PathVariable("id") Long id){
        return userService.deleteUserById(id);
    }

    @PostMapping("")
    public Integer createOrUpdateUser(@RequestBody User user){
        return userService.updateUserById(user);
    }

    @RequestMapping("")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

}