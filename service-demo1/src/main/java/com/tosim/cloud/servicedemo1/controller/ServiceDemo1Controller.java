package com.tosim.cloud.servicedemo1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceDemo1Controller {

    @Value("${demo1}")
    private String demo1;

    @GetMapping("/serviceDemo1")
    public String getDemo1() {
        return demo1;
    }
}
