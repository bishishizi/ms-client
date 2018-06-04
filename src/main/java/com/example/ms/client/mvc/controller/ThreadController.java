package com.example.ms.client.mvc.controller;

import com.example.ms.client.config.CustomThreadPoolExecutor;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;


/**
 *
 * @author wangwenchang
 * @date 2018/6/4 16:21
 */
@Api(tags = "测试")
@RestController
@RequestMapping("/thread")
public class ThreadController {

    @Autowired
    CustomThreadPoolExecutor CustomThreadPoolExecutor;

    @ApiOperation("线程")
    @GetMapping()
    public void test(){
        System.out.println();
        ExecutorService poolExecutor = CustomThreadPoolExecutor.getCustomThreadPoolExecutor();
        System.out.println();
    }
}
