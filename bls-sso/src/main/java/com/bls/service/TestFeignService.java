package com.bls.service;

import com.bls.bean.ResultMsg;
import com.bls.pojo.Test;
import com.bls.service.feign.TestFeignFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @program: bailesi
 * @description:
 * @author: Mr.Yuan
 * @create: 2022-02-04 23:01
 **/
@FeignClient(name = "bls-db-server" ,fallback = TestFeignFallbackService.class)
public interface TestFeignService {

    //获取用户信息
    @RequestMapping(value = "/select/all" , method = RequestMethod.GET)
    ResultMsg<List<Test>> selectAll();

}
