package com.factory.patterns.factoryPattern;

import com.factory.patterns.Buy;
import com.factory.patterns.Orange;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/8 14:54
 */
public class OrangeFactory implements Factory{

    @Override
    public Buy buyFruit() {
        return new Orange();
    }
}
