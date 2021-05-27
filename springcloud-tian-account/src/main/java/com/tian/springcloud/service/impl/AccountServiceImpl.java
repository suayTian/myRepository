package com.tian.springcloud.service.impl;

import com.tian.springcloud.mapper.AccountMapper;
import com.tian.springcloud.pojo.Account;
import com.tian.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Long insert(Account account) {
        return accountMapper.insert(account);
    }

    @Override
    public List<Account> getList() {
        return accountMapper.getList();
    }

    @Override
    public Account selectById(String id) {
        return accountMapper.selectById(id);
    }
}
