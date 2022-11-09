package com.zoe.mysql.controller;


import com.zoe.mysql.entity.User;
import com.zoe.mysql.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhaoccf
 * @version 1.0.0
 * @description
 * @date 2022/11/3 15:39
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    public List<User> findAll() {
        List<User> users = userService.findAll();
        return users;
    }

    @RequestMapping(value = "findById", method = RequestMethod.GET)
    public User findById(Long id) {
        User user = userService.findById(id);
        return user;
    }

    @RequestMapping(value = "findByName", method = RequestMethod.GET)
    public List<User> findByName(String name) {
        List<User> users = userService.findByName(name);
        return users;
    }

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public int addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @RequestMapping(value = "deleteUser", method = RequestMethod.POST)
    public int deleteUser(@RequestParam Long id) {
        return userService.deleteUser(id);
    }

}
