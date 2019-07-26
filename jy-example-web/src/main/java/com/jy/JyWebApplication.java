package com.jy;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

// 定时任务
@EnableScheduling
// 缓存
@EnableCaching
// 开启异步调用
@EnableAsync
@SpringBootApplication
@EnableDubbo
@ComponentScan(basePackages = {"com.jy.*"})
public class JyWebApplication {

    public static void main(String[] args) {
        System.setProperty("es.set.netty.runtime.available.processors", "false");
        SpringApplication.run(JyWebApplication.class, args);
        System.out.println("------------------------------启动成功----------------------------");
    }
}
