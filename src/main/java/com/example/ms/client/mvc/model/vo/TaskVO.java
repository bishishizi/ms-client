package com.example.ms.client.mvc.model.vo;

import com.example.ms.client.util.LogUtil;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author wangwenchang
 * @date 2018/6/8 10:23
 */
public class TaskVO extends TimerTask {

    @Override
    public void run() {
        LogUtil.info("执行时间 : " + new Date());
    }
}
