package com.singleton.patterns.umbrellaLazy;

/**
 * @Author: JiangChen
 * @Description:懒汉式单例
 * 内部类只有在外部类被调用，才进行加载
 * 内部类一定要在方法被初始化之前加载
 * 巧妙避免了线程安全的问题
 * 兼顾了饿汉式的内存浪费问题，也兼顾了synchronized的性能问题
 * 最好的单列实现方式
 * @Date 2018/4/11 14:55
 */
public class LazyNice {

    private static boolean initialized = false;

    private LazyNice(){
        if(!initialized){
            initialized = !initialized;
        }else{
              throw new RuntimeException("单例被破坏");
        }
    }

    //static为了使单例的空间共享
    //final保证这个方法不被重写重载
    public static final LazyNice getInstance(){
            //再返回结果以前一定会先加载内部类，在返回
            System.out.println("看了天气预报，下雨了在带伞");
            return LazyNiceHolder.lazyNice;
    }

    //默认不加载，调用去加载
    //静态内部类
    private static class LazyNiceHolder{
        private static final LazyNice lazyNice = new LazyNice();
    }

}
