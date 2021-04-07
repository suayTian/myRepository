package com.tian.springcloud.controller;

import com.tian.springcloud.pojo.Account;
import com.tian.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
