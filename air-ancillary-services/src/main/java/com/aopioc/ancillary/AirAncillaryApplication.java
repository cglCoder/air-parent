package com.aopioc.ancillary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:JefferyChang
 * @Date:2019/4/16 14:00
 * @Desp:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class AirAncillaryApplication {

    public static void main(String[] args) {

        SpringApplication.run(AirAncillaryApplication.class,args);
    }

}
