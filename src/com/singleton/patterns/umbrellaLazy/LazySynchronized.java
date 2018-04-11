package com.singleton.patterns.umbrellaLazy;

/**
 * @Author: JiangChen
 * @Description:为了线程安全问题，加同步锁
 * @Date 2018/4/11 14:11
 */
public class LazySynchronized {

    private LazySynchronized(){
        System.out.println("不管下不下雨我都不带伞");
    }

    private static LazySynchronized lazySynchronized = null;

    public static synchronized LazySynchronized getInstance(){

        if (lazySynchronized==null){
             System.out.println("下雨了，大家都在抢伞");
            lazySynchronized = new LazySynchronized();
        }
        return lazySynchronized;
    }

}
