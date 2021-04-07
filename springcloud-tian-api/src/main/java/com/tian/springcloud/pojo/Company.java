package com.tian.springcloud.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Getter
@Setter
@Accessors(chain = true)
public class Company {
    private String orgCode;
    private String orgName;
}
