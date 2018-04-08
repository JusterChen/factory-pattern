package com.factory.patterns.factoryPattern;

import com.factory.patterns.Banana;
import com.factory.patterns.Buy;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/8 14:54
 */
public class BananaFactory implements Factory{

    @Override
    public Buy buyFruit() {
        return new Banana();
    }
}
