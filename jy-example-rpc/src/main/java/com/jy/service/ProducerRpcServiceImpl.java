package com.jy.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jy.producer.IProducerRpcService;
import org.springframework.stereotype.Component;

/**
 * @description: 生产者测试实现类
 * @author: huyu
 * @create: 2019-07-17 17:54
 */
@Service(group = "jy-example-rpc", interfaceClass = IProducerRpcService.class)
@Component
public class ProducerRpcServiceImpl implements IProducerRpcService {

    @Override
    public String getMessage(String msg) {
        return "收到的消息为：" + msg;
    }
}
