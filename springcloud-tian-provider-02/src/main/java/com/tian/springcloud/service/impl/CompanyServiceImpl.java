package com.tian.springcloud.service.impl;

import com.tian.springcloud.mapper.CompanyMapper;
import com.tian.springcloud.pojo.Company;
import com.tian.springcloud.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public Long insert(Company company) {
        return companyMapper.insert(company);
    }

    @Override
    public List<Company> getList() {
        return companyMapper.getList();
    }

    @Override
    public Company selectById(String id) {
        return companyMapper.selectById(id);
    }
}
