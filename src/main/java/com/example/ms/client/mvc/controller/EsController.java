//package com.example.ms.client.mvc.controller;
//
//import com.example.ms.client.mvc.model.CustomerEs;
//import com.example.ms.client.mvc.model.Index;
//import com.example.ms.client.mvc.service.EsService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
///**
// * @author wangwenchang
// * @date 2018/5/14 11:40
// */
//@Api(tags = "测试es")
////@RestController
//public class EsController {
//
//    @Autowired
//    EsService esService;
//
//    /**
//     * 新增数据
//     * @param customerEs
//     * @return
//     */
//    @ApiOperation("新增数据")
//    @PostMapping("saveCustomer")
//    public CustomerEs saveCustomer(CustomerEs customerEs) {
//
//        return esService.saveCustomer(customerEs);
//    }
//
//    @ApiOperation("新建索引")
//    @PostMapping("saveIndex")
//    public Boolean saveIndex(Index index) {
//
//        return esService.saveIndex(index);
//    }
//
//    /**
//     * 查询所有
//     *
//     * @return
//     */
//    @ApiOperation("查询所有")
//    @PostMapping("fetchAllCustomers")
//    public List<CustomerEs> fetchAllCustomers() {
//
//        return esService.fetchAllCustomers();
//    }
//}
