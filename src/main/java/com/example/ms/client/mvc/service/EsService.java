package com.example.ms.client.mvc.service;

import com.alibaba.fastjson.JSON;
import com.example.ms.client.mvc.model.CustomerEsRepostiry;
import com.example.ms.client.mvc.model.Index;
import com.example.ms.client.mvc.model.CustomerEs;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangwenchang
 * @date 2018/5/14 11:41
 */
@Service
public class EsService {

    @Autowired
    CustomerEsRepostiry repostiry;

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    /**
     * 保存
     *
     * @param customerEs
     */
    public CustomerEs saveCustomer(CustomerEs customerEs) {
        CustomerEs save = repostiry.save(customerEs);

//        boolean index = elasticsearchTemplate.createIndex(initJsonData());



        return save;
    }

    /**
     * 查询所有
     *
     * @return
     */
    public List<CustomerEs> fetchAllCustomers() {
        Iterable<CustomerEs> result = repostiry.findAll();
        List<CustomerEs> customerEs = Lists.newArrayList(result);

        if (CollectionUtils.isEmpty(customerEs)) {
            return null;
        }
        List<CustomerEs> list = new ArrayList<>();
        for (CustomerEs customerEsTmp : repostiry.findAll()) {
            list.add(customerEsTmp);
        }
        return list;
    }

    public String initJsonData() {
        Index index = new Index();
        index.setIndex("index");
        index.setType("type");
        index.setFieldJson("field");
        index.setNumber_of_shards(2);
        index.setNumber_of_replicas(3);

        return JSON.toJSONString(index);
    }

    /**
     * 新增索引
     * @param index
     * @return
     */
    public Boolean saveIndex(Index index) {
        String jsonString = JSON.toJSONString(index);
//        elasticsearchTemplate.query();
//        return elasticsearchTemplate.createIndex("jsonString");
        return elasticsearchTemplate.createIndex(jsonString);
    }
}
