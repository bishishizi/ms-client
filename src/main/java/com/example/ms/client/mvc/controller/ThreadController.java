package com.example.ms.client.mvc.controller;

import com.example.ms.client.config.CustomThreadPoolExecutor;
import com.example.ms.client.mvc.model.vo.TaskVO;
import com.example.ms.client.util.LogUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.ExecutorService;


/**
 * @author wangwenchang
 * @date 2018/6/4 16:21
 */
@Api(tags = "线程")
@RestController
@RequestMapping("/thread")
public class ThreadController {

    @Autowired
    CustomThreadPoolExecutor CustomThreadPoolExecutor;

    @ApiOperation("线程")
    @GetMapping("")
    public void test() {
        ExecutorService poolExecutor = CustomThreadPoolExecutor.getCustomThreadPoolExecutor();

        System.out.println();
    }

    @ApiOperation("线程")
    @GetMapping("/daemon")
    public void daemon() {
        LogUtil.info("系统当前时间：" + new Date());

        Calendar calendar = Calendar.getInstance();
        //这个时间点执行任务
        calendar.add(Calendar.SECOND, 2);
        Date date = calendar.getTime();
        TaskVO task = new TaskVO();
//        非守护线程,会一直运行
//        Timer timer = new Timer();
//        守护线程,没有用户线程活跃就会停止
        Timer timer = new Timer(true);
//        2秒之后执行,如果没有活跃线程,守护线程就会停止,不会执行线程方法
//        timer.schedule(task, date);
        //2秒之后第一次执行,每隔2秒执行一次
        timer.schedule(task, date, 2000);
    }
}
