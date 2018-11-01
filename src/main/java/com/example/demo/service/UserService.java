package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

/**
 * @classDesc:
 * @Author: mujuyan
 * @createTime: 2018/11/1 13:28
 */

public interface UserService {
    //插入用户
    void insertUser(User user);
}