package com.aopioc.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    protected static Logger logger=LoggerFactory.getLogger(EurekaServerApplication.class);
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication.class).run(args);
    }

}
