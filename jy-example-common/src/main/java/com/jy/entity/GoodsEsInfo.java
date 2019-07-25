package com.jy.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * @description: es测试实体类
 * @author: huyu
 * @create: 2019-07-25 09:43
 */
@Document(indexName = "foods",type = "goods", shards = 1,replicas = 0, refreshInterval = "-1")
public class GoodsEsInfo {

    @Id
    private String id;

    @Field
    private String name;

    @Field
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
