package com.strategy.patterns;

/**
 * @Author: JiangChen
 * @Description:策略模式
 * @Date 2018/4/20 14:44
 */
public class Test {

    public static void main(String[] args) {
        Person person = new Person(3);
        System.out.println(person.trip(SelectTripType.CAR_TYPE));
    }
}
