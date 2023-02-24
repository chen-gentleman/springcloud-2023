package com.chen.serverprovider017003.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author @Chenxc
 * @Date 2023/2/24 16:25
 */
@RestController
public class UserController {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser(@RequestParam(name = "name") String name){
        return "你好！" + name + "现在由server-provider-01-7003,为您服务";
    }
}
