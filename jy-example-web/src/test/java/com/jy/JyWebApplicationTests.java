package com.jy;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JyWebApplicationTests {

    @Autowired
    StringEncryptor encryptor;

    //加密
    @Test
    public void encrytptor() {
        String name = encryptor.encrypt("root");
        System.out.println("加密结果："+name);
    }

    //解密
    @Test
    public void decryptor() {
        String username = encryptor.decrypt("7uBC9fVLpL05ipEPzgsDT6Qcjuq9HvDYc0VUIgP4hY=");
        System.out.println("解密结果："+username);
    }

}
