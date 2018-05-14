package com.example.ms.client.mvc.test.model;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author wangwenchang
 * @date 2018/5/14 11:32
 */
public interface CustomerEsRepostiry extends ElasticsearchRepository<CustomerEs, String> {

    /**
     * 根据第一名字查询
     * @param firstName
     * @return
     */
    List<CustomerEs> findByFirstName(String firstName);

    /**
     * 根据最后一个名字查询
     * @param firstName
     * @return
     */
    List<CustomerEs> findByLastName(String firstName);
}
