package com.bls.controller;

import com.alibaba.fastjson.JSONObject;
import com.bls.bean.ResultMsg;
import com.bls.pojo.Test;
import com.bls.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: bailesi
 * @description: 测试
 * @author: Mr.Yuan
 * @create: 2022-01-24 00:23
 **/
@RestController
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    TestService testService;

    @GetMapping(value = "/bls/db/select/all")
    public ResultMsg<List<Test>> selectAll(){
        List<Test> tests = testService.selectAll();
        LOGGER.info(">>>>> 返回测试结果"+ JSONObject.toJSONString(tests));
        return new ResultMsg<>(tests!=null?1001:2001,tests!=null?"1001":"2001",tests);
    }

}
