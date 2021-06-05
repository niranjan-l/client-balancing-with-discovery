package com.niranjan2021.clientbalancingwithdiscovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {


    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public  String callGoodByeServiceWithLB(){

        return  restTemplate.getForEntity("http://goodbye-service",String.class).getBody();
    }
}
