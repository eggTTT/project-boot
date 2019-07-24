package com.jy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
// 定时任务
@EnableScheduling
// 缓存
@EnableCaching
@ComponentScan(basePackages = {"com.jy.*"})
public class JyJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(JyJobApplication.class, args);
        System.out.println("------------------------------启动成功----------------------------");
    }

}
