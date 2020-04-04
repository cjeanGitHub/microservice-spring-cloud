package com.cjean.springcloud.feign.controller;

import com.cjean.springcloud.feign.interf.TestFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Test {
    @Autowired
    TestFeignClient testFeignClient;

    @GetMapping("/test/{id}")
    public String test(@PathVariable String id){
        return testFeignClient.test(id+":   FeignClient");
    }
}