package com.cjean.springcloud.feign.interf;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="service-provider")
public interface TestFeignClient {
    @RequestMapping(value = "/test/{id}",method = RequestMethod.GET)
    public String test(@PathVariable("id") String id);
}