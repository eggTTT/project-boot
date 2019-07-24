package com.jy.job;

import com.jy.utils.RedisUtils;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @description: xxlJob测试
 * @author: huyu
 * @create: 2019-07-19 10:24
 */
@Component
@JobHandler(value = "JobTestHandler")
public class JobTestHandler extends IJobHandler {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public ReturnT<String> execute(String param) throws Exception {
        System.out.println("执行了JobTestHandler一次");
        return SUCCESS;
    }
}
