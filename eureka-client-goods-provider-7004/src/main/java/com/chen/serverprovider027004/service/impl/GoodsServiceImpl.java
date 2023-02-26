package com.chen.serverprovider027004.service.impl;

import com.chen.serverprovider027004.bean.Goods;
import com.chen.serverprovider027004.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author @Chenxc
 * @date 2023年02月25日 22:47
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    private static final List<Goods> GOODS_LIST = new ArrayList<>();

    static {
        Goods g1 = new Goods("香蕉",11.90);
        Goods g2 = new Goods("苹果",12.80);
        Goods g3 = new Goods("雪梨",15.90);
        Goods g4 = new Goods("桃子",16.20);
        Goods g5 = new Goods("西瓜",13.40);
        GOODS_LIST.addAll(Arrays.asList(g1,g2,g3,g4,g5));
    }



    @Override
    public List<Goods> findAll() {
        return GOODS_LIST;
    }
}
