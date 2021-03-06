package com.tian.springcloud.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Getter
@Setter
@Accessors(chain = true)
public class Account implements Serializable {
    private String name;
    private double money;
}
