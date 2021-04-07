package com.tian.springcloud.service;

import com.tian.springcloud.pojo.Company;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyService {

    Long insert(Company company);

    List<Company> getList();

    Company selectById(@Param("id") String id);
}
