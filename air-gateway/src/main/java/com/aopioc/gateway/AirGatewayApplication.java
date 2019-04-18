package com.aopioc.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 项目名称 : air-parent
 * 包名 : com.aopioc.gateway
 * 功能介绍 : TODO
 *
 * @author : JefferyChang
 * 日期 : 2019/4/15 22:08
 */
@SpringBootApplication
@EnableZuulProxy
public class AirGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirGatewayApplication.class,args);
    }


}
