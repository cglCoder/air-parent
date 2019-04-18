package com.aopioc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:JefferyChang
 * @Date:2019/4/16 10:13
 * @Desp:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class AirConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirConfigApplication.class,args);
    }


}
