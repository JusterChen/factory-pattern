package com.factory.patterns.abstractFactory;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/8 15:13
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        System.out.println(fruitFactory.getApple());
        System.out.println(fruitFactory.getBanana());
        System.out.println(fruitFactory.getOranage());
    }
}
