package com.factory.patterns.factoryPattern;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/8 14:54
 */
public class FactoryTest {

    public static void main(String[] args) {
        Factory appleFactory = new AppleFactory();
        System.out.println(appleFactory.buyFruit());
        Factory bananaFactory = new BananaFactory();
        System.out.println(bananaFactory.buyFruit());
    }
}
