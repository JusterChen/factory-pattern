package com.strategy.patterns.travel;

import com.strategy.patterns.TravelResult;

/**
 * @Author: JiangChen
 * @Description:出行方式飞机
 * @Date 2018/4/20 14:57
 */
public class Plane implements Trip{

    @Override
    public TravelResult play(int hour) {
        System.out.println("选择做飞机的出行方式");
        return new TravelResult(hour,"安全");
    }
}
