package com.max.test.mybatis.service.impl;

import com.max.test.mybatis.entity.User;
import com.max.test.mybatis.mapper.UserMapper;
import com.max.test.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public Integer updateUserById(User user) {
        return userMapper.updateUserById(user);
    }

    @Override
    public Integer deleteUserById(Long id) {
        return userMapper.deleteUserById(id);
    }
}
