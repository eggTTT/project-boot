package com.jy.service;

import com.jy.entity.GoodsEsInfo;

/**
 * @description: es测试mapper
 * @author: huyu
 * @create: 2019-07-24 18:10
 */
public interface GoodsESRepository  {

    /**
     * 查询商品信息
     * @param id
     * @return
     */
    GoodsEsInfo queryGoodsEsInfoById(String id);
}
