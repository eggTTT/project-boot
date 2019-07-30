package com.example;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class JyAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(JyAdminApplication.class, args);
        System.out.println("------------------------------启动成功----------------------------");
    }

}
