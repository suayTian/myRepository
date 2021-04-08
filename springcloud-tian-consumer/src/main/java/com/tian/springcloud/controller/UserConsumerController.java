package com.tian.springcloud.controller;

import com.tian.springcloud.client.UserClient;
import com.tian.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserConsumerController {

    private static final String url = "http://SPRINGCLOUD-TIAN-PROVIDER";

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserClient userClient;

   /* @GetMapping("/getList")
    public List<User> getList() {
        return restTemplate.getForObject(url+"/getList", List.class);
    }*/

    @GetMapping("/getList")
    public List<User> getList() {
        return userClient.getList();
    }
}
