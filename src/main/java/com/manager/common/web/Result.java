package com.manager.common.web;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @program: manager
 * @description: 统一接口返回格式
 * @author: zhangwanxin
 * @create: 2019-03-01 11:17
 **/
@Getter
@Setter
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class Result<T> implements Serializable {

    private static final Integer successCode = 200;
    private static final String successMsg = "请求成功";
    private static final Boolean successState = true;

    private Integer code;
    private String msg;
    private Boolean state;
    private T data;

    public Result(){
        this.code = successCode;
        this.msg = successMsg;
        this.state = successState;
    }
    public Result(Integer code,String msg,Boolean state){
        this.code = code;
        this.msg = msg;
        this.state = state;
    }
    public Result(Integer code,String msg,Boolean state,T data){
        this.code = code;
        this.msg = msg;
        this.state = state;
        this.data = data;
    }
    public Result(T data){
        this.code = successCode;
        this.msg = successMsg;
        this.state = successState;
        this.data = data;
    }
}
