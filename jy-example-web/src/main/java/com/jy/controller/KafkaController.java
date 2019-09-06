package com.jy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: kafka消息测试
 * @author: huyu
 * @create: 2019-07-18 17:03
 */
@Controller
@RequestMapping("/kafka")
public class KafkaController {

//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;
//
//    @GetMapping("/send")
//    public String testKafka() {
//        int iMax = 100;
//        for (int i = 1; i < iMax; i++) {
//            kafkaTemplate.send("test","key" + i, "data" + i);
//        }
//        return "success";
//    }
//
//    @KafkaListener(topics = "test")
//    public void receive(ConsumerRecord<?, ?> consumer) {
//        System.out.println(consumer.topic()+consumer.key()+consumer.value());
//    }
}
