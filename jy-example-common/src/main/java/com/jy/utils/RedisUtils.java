package com.jy.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @description: 操作redis工具类
 * @author: huyu
 * @create: 2019-07-17 16:11
 */
@Component
public class RedisUtils {

    /**
     * redisTemplate.opsForValue(); 操作字符串
     * redisTemplate.opsForHash(); 操作hash
     * redisTemplate.opsForList(); 操作list
     * redisTemplate.opsForSet(); 操作set
     * redisTemplate.opsForZSet(); 操作有序set
     */
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 操作字符串
     */
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 操作string(建议使用stringRedisTemplate)
     */
    public boolean put(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
        return true;
    }

    /**
     * 根据key获取redis值
     * @param key
     */
    public String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    /**
     * put值，并设定过期时间
     * @param key
     * @param value
     * @param timeout
     * @return
     */
    public boolean putAndExpire(String key, String value, Long timeout) {
        stringRedisTemplate.opsForValue().set(key, value, timeout, TimeUnit.SECONDS);
        return true;
    }

    /**
     * put值，并设置偏移量
     * 用 value 参数覆写(overwrite)给定 key 所储存的字符串值，从偏移量 offset 开始
     * @param key
     * @param value
     * @param offset
     * @return
     */
    public boolean putAndOffset(String key, String value, Long offset) {
        stringRedisTemplate.opsForValue().set(key, value, offset);
        return true;
    }

    /**
     * 如果该key缓存已存在返回false，否则返回true
     * @param key
     * @param value
     * @return
     */
    public boolean putIfAbsent(String key, String value) {
        return stringRedisTemplate.opsForValue().setIfAbsent(key, value);
    }

    /**
     * 一次性将map中的值都存入redis
     * @param maps
     * @return
     */
    public boolean multiSet(Map<String, String> maps) {
        stringRedisTemplate.opsForValue().multiSet(maps);
        return true;
    }

    /**
     * 一次性将keys中所有对应的value取回
     * @param keys
     * @return
     */
    public List<String> multiGet(List<String> keys) {
        return stringRedisTemplate.opsForValue().multiGet(keys);
    }

    /**
     * 设置键的字符串值并返回其旧值
     * @param key
     * @param value
     */
    public String getAndSet(String key, String value) {
        return stringRedisTemplate.opsForValue().getAndSet(key, value);
    }
}
