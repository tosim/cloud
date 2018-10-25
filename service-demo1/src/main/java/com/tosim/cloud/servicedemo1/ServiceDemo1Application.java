package com.tosim.cloud.servicedemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //向注册中心注册服务
public class ServiceDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDemo1Application.class, args);
    }
}
