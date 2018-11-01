package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xmlunit.util.Mapper;

/**
 * @classDesc:
 * @Author: mujuyan
 * @createTime: 2018/11/1 13:29
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void insertUser(User user){
        userDao.insertUser(user);
    }
}