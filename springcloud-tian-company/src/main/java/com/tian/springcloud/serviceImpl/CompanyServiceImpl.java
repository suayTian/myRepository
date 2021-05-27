package com.tian.springcloud.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tian.springcloud.mapper.CompanyMapper;
import com.tian.springcloud.pojo.Company;
import com.tian.springcloud.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author TianShuai
 * @since 2021-04-13
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public Company getById(String id) {
        return companyMapper.selectById(id);
    }
}
