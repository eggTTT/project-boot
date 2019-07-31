package com.jy.service;

import com.jy.annotation.DataSource;
import com.jy.entity.Goods;
import com.jy.enumeration.DataSourceEnum;
import com.jy.mapper.GoodsMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huyu
 * @since 2019-07-16
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Override
    @DataSource(DataSourceEnum.DB2)
    @Transactional(transactionManager = "db2TransactionManager")
    public boolean save(Goods goods) {
        return super.save(goods);
    }

}
