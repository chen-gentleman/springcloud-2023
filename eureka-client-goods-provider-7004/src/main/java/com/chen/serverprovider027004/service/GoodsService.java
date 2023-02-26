package com.chen.serverprovider027004.service;

import com.chen.serverprovider027004.bean.Goods;

import java.util.List;

/**
 * @author @Chenxc
 * @date 2023年02月25日 22:46
 */
public interface GoodsService {

    List<Goods> findAll();
}
