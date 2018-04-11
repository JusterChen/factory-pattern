package com.singleton.patterns.Test;

import com.singleton.patterns.umbrellaLazy.Lazy;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: JiangChen
 * @Description: 懒汉模式测试，线程不安全,访问的不是同一个对象
 * @Date 2018/4/11 13:56
 */
public class LazyTest implements Runnable{

    @Override
    public void run() {
        System.out.println(Lazy.getInstance());
    }

    public static void main(String[] args) {
        LazyTest test1 = new LazyTest();
        LazyTest test2 = new LazyTest();
        Thread thread1 = new Thread(test1);
        Thread thread2 = new Thread(test2);

        thread1.start();
        thread2.start();

        /*int count = 200;
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
                    Object object = Lazy.getInstance();
                    System.out.println(object);
                }
            }.start();
            //每循环一次启动一个线程
            //每次启动一个线程 count--
            countDownLatch.countDown();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("总耗时："+(endTime-start));*/
    }
}
