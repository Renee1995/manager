package com.manager.common.web;

public enum ErrorState {


    SYSTEM_ERROR(500,"系统异常",false),              //系统错误

    NO_LOGIN(100,"用户未登录",false),                //用户未登录
    LOGIN_ERROR(101,"用户名或密码错误",false),        //用户名或密码错误
    USERNAME_NOT_EXIST(103,"用户名不存在",false),    //用户名不存在
    USER_NOT_EXIST(102,"用户不存在",false),          //用户不存在
    USER_HAS_EXIST(104,"用户已存在",false),          //用户已存在

    DATA_NOT_EXIST(202,"数据不存在",false),          //数据不存在
    DATA_HAS_EXIST(204,"数据已存在",false),          //数据已存在
    PARAM_IS_NULL(205,"参数为空",false);             //参数为空


    private Integer code;
    private String msg;
    private Boolean state;

    ErrorState(Integer code,String msg,Boolean state) {
        this.code = code;
        this.msg = msg;
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
