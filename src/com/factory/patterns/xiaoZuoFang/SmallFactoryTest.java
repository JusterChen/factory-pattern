package com.factory.patterns.xiaoZuoFang;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/8 14:30
 */
public class SmallFactoryTest {

    public static void main(String[] args) {
        SmallFactory smallFactory = new SmallFactory();
        System.out.println(smallFactory.getButFruit(10));
    }
}
