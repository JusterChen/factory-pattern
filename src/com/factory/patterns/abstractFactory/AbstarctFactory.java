package com.factory.patterns.abstractFactory;

import com.factory.patterns.Buy;

/**
 * @Author: JiangChen
 * @Description: 抽象工厂
 * @Date 2018/4/8 15:04
 */
public abstract class AbstarctFactory {

    abstract Buy getApple();

    abstract Buy getBanana();

    abstract Buy getOranage();

}
