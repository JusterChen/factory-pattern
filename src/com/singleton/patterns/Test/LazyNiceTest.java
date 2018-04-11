package com.singleton.patterns.Test;

import com.singleton.patterns.umbrellaLazy.LazyNice;

import java.lang.reflect.Constructor;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/11 15:25
 */
public class LazyNiceTest implements Runnable{

    @Override
    public void run() {
        System.out.println(LazyNice.getInstance());
    }

    public static void main(String[] args) {
        LazyNiceTest LazyNiceTest1 = new LazyNiceTest();
        LazyNiceTest LazyNiceTest2 = new LazyNiceTest();
        Thread thread1 = new Thread(LazyNiceTest1);
        Thread thread2 = new Thread(LazyNiceTest2);
        thread1.start();
        thread2.start();

      /*  try{
            Class<?> clazz = LazyNice.class;
            //通过反射拿到私有的构造方法
            Constructor<?> constructor = clazz.getDeclaredConstructor(null);
            //强制访问
            constructor.setAccessible(true);
            //暴力初始化
            Object object = constructor.newInstance();
            System.out.println(object);
            Object object1 = constructor.newInstance();
            System.out.println(object1);
        }catch (Exception e){
            e.printStackTrace();
        }*/
    }
}
