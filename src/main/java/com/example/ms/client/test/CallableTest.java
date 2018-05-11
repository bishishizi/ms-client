package com.example.ms.client.test;

import com.example.ms.client.config.CustomThreadPoolExecutor;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * @author wangwenchang
 * @date 2018/5/10 17:06
 */
public class CallableTest implements Callable<String> {

    @Override
    public String call() throws Exception {
        String name = Thread.currentThread().getName();
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000);
        return "callable  : " + name;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("------------------------------------");
        List<Callable<String>> tasks = new ArrayList<>();
        tasks.add(()  -> getResult("Thread"));

        CustomThreadPoolExecutor customThreadPoolExecutor = new CustomThreadPoolExecutor();
        ExecutorService pool = customThreadPoolExecutor.getCustomThreadPoolExecutor();
        List<Future<String>> invokeAll = pool.invokeAll(tasks);
        //过滤
        Stream<Future<String>> futureStream = invokeAll.stream().filter(future -> {
            try {
                return StringUtils.isNotEmpty(future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        });


        System.out.println("----------------Single--------------------");
        CallableTest callable1 = new CallableTest();
        FutureTask<String> task = new FutureTask<>(callable1);
        Thread thread = new Thread(task);
        thread.setName("thread1");
        thread.start();
        String result = task.get();
        System.out.println(result);
    }


    public static String getResult(String name){
        return "result " + name;
    }
}
