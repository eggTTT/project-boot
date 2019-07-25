package com.jy.controller;


import com.alibaba.fastjson.JSON;
import com.jy.entity.Goods;
import com.jy.entity.GoodsEsInfo;
import com.jy.service.GoodsESRepository;
import com.jy.service.IGoodsService;
import com.jy.utils.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @Autowired
    private GoodsESRepository goodsESRepository;

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

    /**
     * 添加
     * @return
     */
    @RequestMapping("/add")
    public String add() {
        GoodsEsInfo goodsEsInfo = new GoodsEsInfo();
        goodsEsInfo.setId("1");
        goodsEsInfo.setName("苹果");
        goodsEsInfo.setDescription("红富士");
        goodsESRepository.save(goodsEsInfo);
        logger.info("新增成功");
        return "success";
    }

    /**
     * 删除
     * @return
     */
    @RequestMapping("/delete")
    public String delete() {
        GoodsEsInfo goodsEsInfo = goodsESRepository.queryGoodsEsInfoById("1");
        goodsESRepository.delete(goodsEsInfo);
        logger.info("删除成功");
        return "success";
    }

    /**
     * 局部更新
     * @return
     */
    @RequestMapping("/update")
    public String update() {
        GoodsEsInfo goodsEsInfo = goodsESRepository.queryGoodsEsInfoById("1");
        goodsEsInfo.setName("橘子");
        goodsEsInfo.setDescription("柑橘");
        goodsESRepository.save(goodsEsInfo);
        logger.info("更新成功");
        return "success";
    }

    /**
     * 查询
     * @return
     */
    @RequestMapping("/query")
    public GoodsEsInfo query() {
        GoodsEsInfo goodsEsInfo = goodsESRepository.queryGoodsEsInfoById("1");
        logger.info(JSON.toJSONString(goodsEsInfo));
        return goodsEsInfo;
    }
}

