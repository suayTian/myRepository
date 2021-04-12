package com.tian.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tian.springcloud.pojo.User;
import com.tian.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getById/{id}")
    @HystrixCommand(fallbackMethod = "hystrixUser")
    public User getById(@PathVariable("id") String id) throws Exception {
        User user = userService.selectById(id);
        if (user == null) {
            throw new Exception("没有可用的id");
        }
        return user;
    }

    public User hystrixUser(String id) {
        return new User().setAge(18).setSex("女").setName("甜甜");
    }
}
