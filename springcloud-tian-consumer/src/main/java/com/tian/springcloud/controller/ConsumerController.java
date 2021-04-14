package com.tian.springcloud.controller;

import com.tian.springcloud.client.ConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ConsumerController {

    private static final String url = "http://SPRINGCLOUD-TIAN-PROVIDER";

    /*@Autowired
    private RestTemplate restTemplate;*/
    @Autowired
    private ConsumerClient consumerClient;

   /* @GetMapping("/getList")
    public List<User> getList() {
        return restTemplate.getForObject(url+"/getList", List.class);
    }*/

    @GetMapping("/getList")
    public List<Map<String, Object>> getList() {
        return consumerClient.getList();
    }

    @GetMapping("/getById/{id}")
    public Map<String, Object> getById(@PathVariable("id") String id) {
        return consumerClient.getById(id);
    }
}
