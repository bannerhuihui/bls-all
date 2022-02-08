package com.bls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: bailesi
 * @description: sso单点登录系统
 * @author: Mr.Yuan
 * @create: 2022-01-26 10:01
 **/
@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@ComponentScan(value = {"com.bls"})
public class SsoApplication {


    public static void main(String[] args) {
        SpringApplication.run(SsoApplication.class,args);
    }


}
