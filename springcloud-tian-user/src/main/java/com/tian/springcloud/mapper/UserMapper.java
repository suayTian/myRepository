package com.tian.springcloud.mapper;

import com.tian.springcloud.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    Long insert(User user);

    List<User> getList();

    User selectById(@Param("id") String id);
}
