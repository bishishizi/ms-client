package com.example.ms.client.mvc.controller;

import com.example.ms.client.mvc.model.User;
import com.example.ms.client.mvc.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangwenchang
 * @date 2018/5/3 14:29
 */
@Api(tags = "测试")
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("")
    @ApiOperation("你好")
    public String hello(){
        User user = new User();
        helloService.hello();
        System.out.println("你");
        return "你好";
    }
}
