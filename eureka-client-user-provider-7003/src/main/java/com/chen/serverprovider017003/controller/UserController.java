package com.chen.serverprovider017003.controller;

import com.chen.serverprovider017003.bean.User;
import com.chen.serverprovider017003.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author @Chenxc
 * @Date 2023/2/24 16:25
 */
@RestController("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<User> findAll(){
        return userService.findAll();
    }
}
