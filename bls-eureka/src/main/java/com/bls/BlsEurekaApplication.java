package com.bls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: bailesi
 * @description: 百乐思Eureka
 * @author: Mr.Yuan
 * @create: 2022-01-23 23:22
 **/
@SpringBootApplication
@EnableEurekaServer
public class BlsEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlsEurekaApplication.class,args);
    }
}
