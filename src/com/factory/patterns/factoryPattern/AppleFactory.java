package com.factory.patterns.factoryPattern;

import com.factory.patterns.Apple;
import com.factory.patterns.Buy;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/8 14:54
 */
public class AppleFactory implements Factory{

    @Override
    public Buy buyFruit() {
        return new Apple();
    }
}
