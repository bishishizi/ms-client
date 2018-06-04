package com.example.ms.client.mvc.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author wangwenchang
 * @date 2018/5/14 11:23
 */

@Document(indexName = "es-customer" ,type = "customer" ,shards = 2 ,replicas = 1 ,refreshInterval = "-1" )
@Data
public class CustomerEs {

    @Id
    private String id;

    private String firstName;

    private String lastName;
}
