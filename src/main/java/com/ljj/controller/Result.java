package com.ljj.controller;
//对controller返回结果封装成result形式
public class Result {
    private Object data;
    private Integer code;
    private String msg;

    public Result() {
    }
    //不带消息

    public Result(Integer code,Object data) {
        this.data = data;
        this.code = code;
    }

    //带消息
    public Result(Integer code, Object data, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
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
}
