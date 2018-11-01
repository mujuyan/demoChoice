package com.example.demo;

import com.example.demo.controller.UserController;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DemoApplicationTests {
    @Autowired
    private UserService userServiceImpl ;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setUserName("mm");
        user.setPassWord("mjy123");
        userServiceImpl.insertUser(user);
    }

}
