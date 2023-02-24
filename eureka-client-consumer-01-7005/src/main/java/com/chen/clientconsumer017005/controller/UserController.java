package com.chen.clientconsumer017005.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author @Chenxc
 * @Date 2023/2/24 17:01
 */
@RestController
public class UserController {

    @Value("${server-url.userServer}")
    private String serverUrl;
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser(@RequestParam("name") String name){
        return restTemplate.getForObject("http://"+serverUrl+"/user?name="+name,String.class);
    }
}
