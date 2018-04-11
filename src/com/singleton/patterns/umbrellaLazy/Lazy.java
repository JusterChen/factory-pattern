package com.singleton.patterns.umbrellaLazy;

/**
 * @Author: JiangChen
 * @Description:懒汉模式
 * 在外部使用时才进行实例化
 * @Date 2018/4/11 13:39
 */
public class Lazy {

    private Lazy(){
        System.out.println("不管下不下雨我都不带伞");
    }

    //静态块，公共内存区域（线程不安全）
    private static Lazy lazy = null;

    public static Lazy getInstance(){
           //调用方法之前先判断，如果没有初始化，将其初始化，并赋值
           //将该实例缓存好
           System.out.println("下雨了，我没带伞");
           if (lazy==null){
                //造成线程不安全的问题
                //2个线程同时进入，会new2次对象，其中一个会覆盖另外一个
               lazy = new Lazy();
               System.out.println("下雨了，大家都在抢伞");
           }
           //如果已赋值，保存之前已经存在的
           return lazy;
    }


}
