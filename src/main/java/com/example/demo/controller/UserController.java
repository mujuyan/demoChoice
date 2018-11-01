package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classDesc:
 * @Author: mujuyan
 * @createTime: 2018/11/1 13:26
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user")
    public void insertUser(@RequestParam User user){
        userService.insertUser(user);
    }
}