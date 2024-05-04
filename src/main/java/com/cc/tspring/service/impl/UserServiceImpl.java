package com.cc.tspring.service.impl;

import com.cc.tspring.dao.UserMapper;
import com.cc.tspring.entity.User;
import com.cc.tspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public void add(User user) {
        userMapper.addOneUser(user);

    }
}
