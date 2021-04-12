package com.tian.springcloud.client;

import com.tian.springcloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "SPRINGCLOUD-TIAN-PROVIDER")
public interface UserClient {

    @GetMapping("/getList")
    List<User> getList();

    @GetMapping("/getById/{id}")
    User getById(@PathVariable("id") String id);
}
