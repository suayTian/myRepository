package com.tian.springcloud.controller;

import com.tian.springcloud.pojo.User;
import com.tian.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    public Long insert(@RequestBody User user) {
        return userService.insert(user);
    }


    @GetMapping("/getList")
    public List<User> getList() {
        return userService.getList();
    }
}
