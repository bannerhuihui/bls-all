package com.bls.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program: bailesi
 * @description:
 * @author: Mr.Yuan
 * @create: 2022-02-05 18:39
 **/
@SpringCloudApplication
@EnableZuulProxy
public class BlsGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlsGatewayApplication.class,args);
    }
}
