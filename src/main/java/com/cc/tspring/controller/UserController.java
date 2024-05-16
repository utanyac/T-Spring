package com.cc.tspring.controller;

import com.cc.tspring.entity.User;
import com.cc.tspring.service.UserService;
import com.cc.tspring.util.CustomResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tspring")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/add/user")
    public void addUser(@RequestBody User user) {
        logger.info("---------- 添加一个新用户 ----------");
        userService.add(user);
    }

    @GetMapping("list/users")
    public CustomResponse<List<User>> listUsers() {
        logger.info("---------- 显示用户列表 ----------");
        List<User> users = userService.selectAll();
        CustomResponse<List<User>> customResponse = new CustomResponse<>();
        customResponse.message("success").status(200).data(users);
        return customResponse;
    }


}
