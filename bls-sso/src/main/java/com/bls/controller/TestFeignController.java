package com.bls.controller;

import com.bls.bean.ResultMsg;
import com.bls.pojo.Test;
import com.bls.service.TestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: bailesi
 * @description:
 * @author: Mr.Yuan
 * @create: 2022-02-04 23:07
 **/
@RestController
public class TestFeignController {

    @Autowired
    private TestFeignService testFeignService;

    @GetMapping(value = "/bls/sso/select/all")
    public ResultMsg<List<Test>> selectAll(){
        ResultMsg<List<Test>> listResultMsg = testFeignService.selectAll();
        return listResultMsg;
    }

}
