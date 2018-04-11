package com.singleton.patterns.umbrellaHungry;

/**
 * @Author: JiangChen
 * @Description:饿汉式单例  (应用场景，以下雨带伞为例)
 * 在类加载的时候就初始化，创建单例对象
 * 优点：没有加任何的锁，执行效率比较高，用户体验比懒汉式好
 * 缺点：在类加载的时候就初始化，不管用与不用，都占着空间，浪费了内存
 * @Date 2018/4/11 12:57
 */
public class Hungry {

    private Hungry(){

    }

    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        System.out.println("不管下不下雨，我都带伞");
        return hungry;
    }

    public static void main(String[] args) {
        getInstance();
        System.out.println(hungry==null);
    }

}
