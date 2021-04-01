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
public class User implements Serializable {

    private String name;
    private int age;
    private String sex;


}
