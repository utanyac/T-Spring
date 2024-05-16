package com.cc.tspring.service;

import com.cc.tspring.entity.User;

import java.util.List;

public interface UserService {

    void add(User user);

    List<User> selectAll();

}
