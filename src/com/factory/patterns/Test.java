package com.factory.patterns;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/8 14:14
 */
public class Test {

    public static void main(String[] args) {
        Apple apple  = new Apple();
        System.out.println(apple.buyFruit());
        Banana banana = new Banana();
        System.out.println(banana.buyFruit());
        Orange orange = new Orange();
        System.out.println(orange.buyFruit());
    }
}
