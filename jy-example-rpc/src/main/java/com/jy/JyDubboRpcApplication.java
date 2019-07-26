package com.jy;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

// 缓存
@EnableCaching
@SpringBootApplication
@EnableDubbo
@ComponentScan(basePackages = {"com.jy.*"})
public class JyDubboRpcApplication {

    public static void main(String[] args) {
        System.setProperty("es.set.netty.runtime.available.processors", "false");
        SpringApplication.run(JyDubboRpcApplication.class, args);
        System.out.println("------------------------------启动成功----------------------------");
    }

}
