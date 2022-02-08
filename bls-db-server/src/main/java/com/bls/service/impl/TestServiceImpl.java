package com.bls.service.impl;

import com.bls.mapper.TestMapper;
import com.bls.pojo.Test;
import com.bls.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: bailesi
 * @description:
 * @author: Mr.Yuan
 * @create: 2022-01-24 00:32
 **/
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;


    @Override
    public List<Test> selectAll() {
        return testMapper.selectAll();
    }
}
