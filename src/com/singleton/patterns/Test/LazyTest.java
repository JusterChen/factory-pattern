package com.singleton.patterns.Test;

import com.singleton.patterns.umbrellaLazy.Lazy;

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
    }
}
