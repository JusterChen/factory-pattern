package com.singleton.patterns.Test;

import com.singleton.patterns.umbrellaLazy.Lazy;
import com.singleton.patterns.umbrellaLazy.LazySynchronized;

/**
 * @Author: JiangChen
 * @Description:懒汉模式测试，加了同步锁，线程安全,访问的是同一个对象，但是性能有问题
 * @Date 2018/4/11 14:18
 */
public class LazySynchionizedTest implements Runnable{

    @Override
    public void run() {
        System.out.println(LazySynchronized.getInstance());
    }

    public static void main(String[] args) {
        //线程安全,访问的是同一个对象
       /* LazySynchionizedTest test1 = new LazySynchionizedTest();
        LazySynchionizedTest test2 = new LazySynchionizedTest();
        Thread thread1 = new Thread(test1);
        Thread thread2 = new Thread(test2);

        thread1.start();
        thread2.start();*/

        //性能有问题
        //没有加同步锁
        long start = System.currentTimeMillis();
        for(int i=0;i<9999999;i++){
            Object object = Lazy.getInstance();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        //加同步锁  性能问题
        long start1 = System.currentTimeMillis();
        for(int i=0;i<9999999;i++){
            Object object = LazySynchronized.getInstance();
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);

    }
}
