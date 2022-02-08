package com.bls.mapper;

import com.bls.pojo.Test;

import java.util.List;

/**
 * @program: bailesi
 * @description: 测试Mapper
 * @author: Mr.Yuan
 * @create: 2022-01-24 00:18
 **/
public interface TestMapper {

    List <Test> selectAll();
}
