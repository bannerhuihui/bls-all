package com.bls.bean;

import java.io.Serializable;

/**
 * @program: bailesi
 * @description: 返回参数
 * @author: Mr.Yuan
 * @create: 2022-01-24 00:26
 **/
public class ResultMsg<T> implements Serializable {

    private static final long serialVersionUID = -1322865535900502445L;

    private int code;
    private String env;
    private T msg;

    public ResultMsg(int code, String env, T msg) {
        this.code = code;
        this.env = env;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }
}
