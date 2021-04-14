package com.tian.springcloud.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User implements Serializable {

    private String name;
    private int age;
    private String sex;


}
