package com.example.ms.client.mvc.test.model;

import lombok.Data;

/**
 * @author wangwenchang
 * @date 2018/5/15 10:40
 */
@Data
public class Index {

    /**
     * 索引名
     */
    private String index;
    /**
     * type表名
     */
    private String type;

    /**
     * 分片数
     */
    private Integer number_of_shards;

    /**
     * 备份数
     */
    private Integer number_of_replicas;

    /**
     * 字段类型
     */
    private String fieldJson;
}
