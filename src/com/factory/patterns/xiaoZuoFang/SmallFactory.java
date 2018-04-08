package com.factory.patterns.xiaoZuoFang;

import com.factory.patterns.Apple;
import com.factory.patterns.Banana;
import com.factory.patterns.Buy;
import com.factory.patterns.Orange;

/**
 * @Author: JiangChen
 * @Description: 小作坊
 * @Date 2018/4/8 14:20
 */
public class SmallFactory {

    public Buy getButFruit(int price){
        if (price==10){
            return new Apple();
        }else if(price==8){
            return new Banana();
        }else if(price==6){
            return new Orange();
        }else {
           return null;
        }
    }
}
