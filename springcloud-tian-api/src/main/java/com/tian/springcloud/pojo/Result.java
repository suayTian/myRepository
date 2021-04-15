package com.tian.springcloud.pojo;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result success(Object data) {
        return new Result(200, "请求成功", data);
    }

    public static Result failed(Integer code, String message, Object data) {
        return new Result(code, message, data);
    }

}
