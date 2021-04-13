package com.tian.springcloud.controller;


import com.tian.springcloud.pojo.Account;
import com.tian.springcloud.pojo.Company;
import com.tian.springcloud.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author TianShuai
 * @since 2021-04-13
 */
@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/getList")
    public List<Company> getList() {
        return companyService.list();
    }
}

