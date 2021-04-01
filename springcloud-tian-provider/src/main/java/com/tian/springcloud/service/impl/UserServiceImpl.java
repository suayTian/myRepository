package com.tian.springcloud.service.impl;

import com.tian.springcloud.mapper.UserMapper;
import com.tian.springcloud.pojo.User;
import com.tian.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Long insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> getList() {
        return userMapper.getList();
    }

    @Override
    public User selectById(String id) {
        return userMapper.selectById(id);
    }
}
