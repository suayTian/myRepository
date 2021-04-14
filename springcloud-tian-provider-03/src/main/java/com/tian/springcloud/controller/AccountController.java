package com.tian.springcloud.controller;

import com.tian.springcloud.pojo.Account;
import com.tian.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/insert")
    public Long insert(@RequestBody Account account) {
        return accountService.insert(account);
    }


    @GetMapping("/getList")
    public List<Account> getList() {
        return accountService.getList();
    }

    @GetMapping("/getById/{id}")
    public Account getById(@PathVariable("id") String id) {
        return accountService.selectById(id);
    }
}
