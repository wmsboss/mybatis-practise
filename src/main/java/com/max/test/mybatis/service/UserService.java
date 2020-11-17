package com.max.test.mybatis.service;

import com.max.test.mybatis.entity.User;

import java.util.List;

public interface UserService {
    User getUser(Long id);

    List<User> getAllUser();

    Integer updateUserById(User user);

    Integer deleteUserById(Long id);
}
