package com.manager.common.web;

/**
 * @program: manager
 * @description: 统一结果返回工具类
 * @author: zhangwanxin
 * @create: 2019-03-01 11:52
 **/
public class ResponseUtil {

    public static Result success() {
        return new Result();
    }
    public static Result success(Object obj) {
        return new Result(obj);
    }
}
