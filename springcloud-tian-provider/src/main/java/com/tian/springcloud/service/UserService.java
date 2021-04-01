package com.tian.springcloud.service;

import com.tian.springcloud.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    Long insert(User user);

    List<User> getList();

    User selectById(@Param("id") String id);
}
