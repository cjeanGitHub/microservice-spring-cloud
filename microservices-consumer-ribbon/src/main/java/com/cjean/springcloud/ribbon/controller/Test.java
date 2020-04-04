package com.cjean.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class Test {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test/{id}")
    public String test(@PathVariable String id){
        return this.restTemplate.getForObject("http://service-provider/test/"+id+":  ribbon",String.class);
    }
}