package com.bls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: bailesi
 * @description: 百乐思数据操作启动类
 * @author: Mr.Yuan
 * @create: 2022-01-23 23:52
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.bls.mapper"})
public class BlsDBServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlsDBServerApplication.class,args);
    }
}
