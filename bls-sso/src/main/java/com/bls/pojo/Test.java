package com.bls.pojo;

import java.io.Serializable;

/**
 * @program: bailesi
 * @description: 测试使用的类
 * @author: Mr.Yuan
 * @create: 2022-01-24 00:20
 **/

public class Test implements Serializable {

    private static final long serialVersionUID = -8276517904778674243L;

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
