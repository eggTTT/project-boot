package com.jy.utils;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: encrypt加密解密工具类
 * @author: huyu
 * @create: 2019-07-30 14:35
 */
@Component
public class JasyptUtils {

    @Autowired
    private StringEncryptor encryptor;

    /**
     * 加密
     * @param pwdBefore
     * @return
     */
    public String encrypt(String pwdBefore) {
        return encryptor.encrypt(pwdBefore);
    }

    /**
     * 解密
     * @param pwdAfter
     * @return
     */
    private String decrypt(String pwdAfter) {
        return encryptor.decrypt(pwdAfter);
    }
}
