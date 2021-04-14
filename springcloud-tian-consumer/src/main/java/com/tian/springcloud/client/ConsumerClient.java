package com.tian.springcloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@FeignClient(value = "SPRINGCLOUD-TIAN-PROVIDER")
public interface ConsumerClient {

    @GetMapping("/getList")
    List<Map<String, Object>> getList();

    @GetMapping("/getById/{id}")
    Map<String, Object> getById(@PathVariable("id") String id);
}
