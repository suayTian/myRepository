package com.tian.springcloud.mapper;

import com.tian.springcloud.pojo.Company;
import com.tian.springcloud.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CompanyMapper {

    Long insert(Company user);

    List<Company> getList();

    Company selectById(@Param("id") String id);
}
