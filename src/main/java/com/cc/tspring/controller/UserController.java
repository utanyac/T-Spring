package com.cc.tspring.controller;

import com.cc.tspring.entity.User;
import com.cc.tspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tspring")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public void addUser(@RequestBody User user) {
        userService.add(user);
    }


}
