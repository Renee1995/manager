package com.manager.common.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: manager
 * @description: 异常处理的全局配置类
 * @author: zhangwanxin
 * @create: 2019-03-01 11:47
 **/
@ControllerAdvice
@Slf4j
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Result handleBusinessException(HttpServletRequest request, BusinessException ex) {
        Result response;
        log.error("StudentException code:{},msg:{}", ex.getResponse().getCode(), ex.getResponse().getMsg());
        response = new Result(ex.getResponse().getCode(), ex.getResponse().getMsg(),false);
        return response;
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handleException(HttpServletRequest request, Exception ex) {
        Result response;
        log.error("exception error:{}", ex);
        response = new Result(ErrorState.SYSTEM_ERROR.getCode(),
                ErrorState.SYSTEM_ERROR.getMsg(),false);
        return response;
    }
}
