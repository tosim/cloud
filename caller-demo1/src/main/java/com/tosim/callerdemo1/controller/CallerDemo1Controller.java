package com.tosim.callerdemo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallerDemo1Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/callServiceDemo1")
    public String callServiceDemo1() {
        return restTemplate.getForObject("http://SERVICE-DEMO1/serviceDemo1", String.class);
    }
}
