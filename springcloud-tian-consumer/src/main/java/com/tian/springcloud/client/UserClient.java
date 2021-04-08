package com.tian.springcloud.client;

import com.tian.springcloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "SPRINGCLOUD-TIAN-PROVIDER")
public interface UserClient {

    @GetMapping("/getList")
    List<User> getList();
}
