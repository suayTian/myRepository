package com.tian.springcloud.advice;

import com.tian.springcloud.fallback.BusinessException;
import com.tian.springcloud.pojo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class MyExceptionAdvice {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyExceptionAdvice.class);
    private static final String DEFAULT_ERR_MESSAGE = "请求失败:";

    @ExceptionHandler(Exception.class)
    public Result exceptionHandler(Exception e, HttpServletResponse response) {
        LOGGER.info("异常-->{}", e.getMessage());
        return Result.failed(HttpStatus.INTERNAL_SERVER_ERROR.value(), DEFAULT_ERR_MESSAGE + e.getMessage(), null);
    }

    @ExceptionHandler(BusinessException.class)
    public Result businessExceptionHandler(Exception e, HttpServletResponse response) {
        LOGGER.info("业务异常-->{}", e.getMessage());
        return Result.failed(HttpStatus.NOT_IMPLEMENTED.value(), DEFAULT_ERR_MESSAGE + e.getMessage(), null);
    }
}
