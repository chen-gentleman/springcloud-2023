package com.chen.serverprovider027004.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.chen.serverprovider027004.bean.Goods;
import com.chen.serverprovider027004.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author @Chenxc
 * @Date 2023/2/24 16:31
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Goods> findAll(){
        return goodsService.findAll();
    }
}
