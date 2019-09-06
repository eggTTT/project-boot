package com.jy.config.elasticsearch;

import com.jy.config.redisConfig.RedisAutoConfig;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @description: elasticsearch配置类
 * @author: huyu
 * @create: 2019-08-01 20:01
 */

//@Configuration
//@AutoConfigureBefore(RedisAutoConfig.class)
public class ElasticSearchConfig {

    @PostConstruct
    void init() {
        System.setProperty("es.set.netty.runtime.available.processors", "false");
    }

//    @Bean(name = "elasticsearchTemplate")
//    public ElasticsearchTemplate elasticsearchTemplate(Client client, ElasticsearchConverter converter) {
//        try {
//            return new ElasticsearchTemplate(client, converter);
//        } catch (Exception ex) {
//            throw new IllegalStateException(ex);
//        }
//    }

//    @Bean
//    public ElasticsearchConverter elasticsearchConverter(SimpleElasticsearchMappingContext mappingContext) {
//        return new MappingElasticsearchConverter(mappingContext);
//    }
//
//    @Bean
//    public SimpleElasticsearchMappingContext mappingContext() {
//        return new SimpleElasticsearchMappingContext();
//    }
}
