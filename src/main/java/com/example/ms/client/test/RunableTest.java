package com.example.ms.client.test;

/**
 * @author wangwenchang
 * @date 2018/5/10 17:06
 */
public class RunableTest implements  Runnable{


    private String message;

    public RunableTest(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            String name = Thread.currentThread().getName();
            long start = System.currentTimeMillis();
            Thread.sleep(1000);
            long end = System.currentTimeMillis();
            System.out.println( name + " : "+(end - start) / 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println(message);
    }

    public static void main(String[] args) {

        RunableTest runbale = new RunableTest("runbale");
        RunableTest runbale2 = new RunableTest("runbale2");

        Thread thread = new Thread(runbale);
        thread.setName("thread");
        Thread thread2 = new Thread(runbale2);
        thread2.setName("thread2");
        thread.start();
        thread2.start();
    }
}
