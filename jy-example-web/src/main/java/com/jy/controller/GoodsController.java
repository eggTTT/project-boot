package com.jy.controller;


import com.jy.entity.Goods;
import com.jy.service.IGoodsService;
import com.jy.utils.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.math.BigDecimal;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huyu
 * @since 2019-07-16
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    public final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private IGoodsService goodsService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    @RequestMapping("/insert")
    public void insert() {
        Goods goods = new Goods();

        goods.setName("test3");
        goods.setColor("test");
        goods.setPrice(new BigDecimal(1));
        goods.setNum(1);
        goods.setSupplier("test");

        goodsService.save(goods);
        logger.info("保存成功了");
    }

    @RequestMapping("/set")
    public void set() {
        redisUtils.put("testtest1", "testtest1");
        redisUtils.put("testtest2", "testtest2");
        logger.info("缓存设置成功了");
    }
}

