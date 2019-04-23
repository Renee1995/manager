package com.manager.common.web;

/**
 * @program: manager
 * @description: 自定义异常 统一异常捕获类
 * @author: zhangwanxin
 * @create: 2019-03-01 11:46
 **/
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = -6370612186038915645L;

    private final ErrorState response;

    public BusinessException(ErrorState response) {
        this.response = response;
    }
    public ErrorState getResponse() {
        return response;
    }
}
