package com.factory.patterns.abstractFactory;

import com.factory.patterns.Apple;
import com.factory.patterns.Banana;
import com.factory.patterns.Buy;
import com.factory.patterns.Orange;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/8 15:10
 */
public class FruitFactory extends AbstarctFactory {

    @Override
    Buy getApple() {
        return new Apple();
    }

    @Override
    Buy getBanana() {
        return new Banana();
    }

    @Override
    Buy getOranage() {
        return new Orange();
    }
}
