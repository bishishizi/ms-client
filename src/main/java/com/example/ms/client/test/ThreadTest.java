package com.example.ms.client.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wangwenchang
 * @date 2018/5/11 10:21
 */
public class ThreadTest {

    private ThreadPoolExecutor pool = null;

    public void init() {

        pool = new ThreadPoolExecutor(
                10,
                30,
                30,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<Runnable>(10));

    }

    public class CutomThreadFactory implements ThreadFactory {

        @Override
        public Thread newThread(Runnable r) {
            return null;
        }
    }

}
