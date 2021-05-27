package com.tian.springcloud.service;

import com.tian.springcloud.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountService {

    Long insert(Account account);

    List<Account> getList();

    Account selectById(@Param("id") String id);
}
