package com.zoe.mysql.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zoe.mysql.entity.User;
import com.zoe.mysql.mapper.UserMapper;
import com.zoe.mysql.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhaoccf
 * @version 1.0.0
 * @description
 * @date 2022/11/3 15:31
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        List<User> users = userMapper.selectList(null);
        return users;
    }

    @Override
    public User findById(Long id) {
        User user = userMapper.selectById(id);
        return user;
    }

    @Override
    public List<User> findByName(String name) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        List<User> users = userMapper.selectList(queryWrapper);
        return users;
    }

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int deleteUser(Long id) {
        return userMapper.deleteById(id);
    }
}
