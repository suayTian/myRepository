package com.tian.springcloud.controller;

import com.tian.springcloud.pojo.Company;
import com.tian.springcloud.pojo.User;
import com.tian.springcloud.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/insert")
    public Long insert(@RequestBody Company company) {
        return companyService.insert(company);
    }


    @GetMapping("/getList")
    public List<Company> getList() {
        return companyService.getList();
    }
}
