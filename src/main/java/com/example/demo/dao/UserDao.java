package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @classDesc:
 * @Author: mujuyan
 * @createTime: 2018/11/1 13:30
 */
@Mapper
public interface UserDao {
    void insertUser(User user);
}