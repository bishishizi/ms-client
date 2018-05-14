package com.example.ms.client.mvc.test.service;

import com.example.ms.client.mvc.test.model.CustomerEs;
import com.example.ms.client.mvc.test.model.CustomerEsRepostiry;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
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

    /**
     * 保存
     * @param customerEs
     */
    public CustomerEs saveCustomer(CustomerEs customerEs){
        CustomerEs save = repostiry.save(customerEs);
        return save;
    }

    /**
     * 查询所有
     * @return
     */
    public List<CustomerEs>  fetchAllCustomers(){
        Iterable<CustomerEs> result = repostiry.findAll();
        List<CustomerEs> customerEs = Lists.newArrayList(result);

        if (CollectionUtils.isEmpty(customerEs)){
            return null;
        }
        List<CustomerEs> list= new ArrayList<>();
        for (CustomerEs customerEsTmp: repostiry.findAll()){
            list.add(customerEsTmp);
        }
        return list;
    }
}
