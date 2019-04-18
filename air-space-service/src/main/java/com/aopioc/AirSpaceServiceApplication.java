package com.aopioc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@ComponentScan(basePackages = {"com.aopioc.service"})
public class AirSpaceServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AirSpaceServiceApplication.class).run(args);
    }


}
