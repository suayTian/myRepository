package com.tian.springcloud.mapper;

import com.tian.springcloud.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper {

    Long insert(Account account);

    List<Account> getList();

    Account selectById(@Param("id") String id);
}
