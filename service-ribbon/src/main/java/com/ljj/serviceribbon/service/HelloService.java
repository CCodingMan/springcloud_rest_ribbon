package com.ljj.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: ljj
 * @Date: 2019/8/20 15:25
 * @Description:
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    public String helloService(String name){
        return restTemplate.getForObject("http://eureka-client/hello/" + name, String.class);
    }
}
