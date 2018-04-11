package com.singleton.patterns.Test;

import com.singleton.patterns.register.RegisterMap;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/11 19:15
 */
public class RegisterTest {

    public static void main(String[] args) {
        int count = 200;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        long start = System.currentTimeMillis();
        for (int i=0;i<count;i++){
            new Thread(){
                public void run(){
                    try {
                        //阻塞
                        //count=0,就会释放所有的共享锁
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Object object = RegisterMap.getBean("com.singleton.patterns.register.Pojo");
                    System.out.println(object);
                }
            }.start();
            //每循环一次启动一个线程
            //每次启动一个线程 count--
            countDownLatch.countDown();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("总耗时："+(endTime-start));
    }
}
