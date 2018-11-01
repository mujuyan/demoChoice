package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classDesc:
 * @Author: mujuyan
 * @createTime: 2018/11/1 10:47
 */
@RestController
@RequestMapping("demo")
public class HelloController {
    @Autowired
    private UserService userServiceImpl;
    @RequestMapping("/hello")
    public void say(){
        User user = new User();
        user.setUserName("mm");
        user.setPassWord("mjy123");
        userServiceImpl.insertUser(user);
    }
    @RequestMapping("/hi")
    public String hi(){
        return "hello";
    }
}