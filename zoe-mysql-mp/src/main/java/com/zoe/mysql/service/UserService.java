package com.zoe.mysql.service;

import com.zoe.mysql.entity.User;

import java.util.List;

/**
 * @author zhaoccf
 * @version 1.0.0
 * @description
 * @date 2022/11/3 15:28
 */
public interface UserService {
    List<User> findAll();
    User findById(Long id);
    List<User> findByName(String name);
    int addUser(User user);
    int deleteUser(Long id);
}
