package com.strategy.patterns.travel;


import com.strategy.patterns.TravelResult;

/**
 * @Author: JiangChen
 * @Description:出行方式步行
 * @Date 2018/4/20 15:05
 */
public class Walk implements Trip{

    @Override
    public TravelResult play(int hour) {
        System.out.println("选择的是走路的出行方式");
        return new TravelResult(hour,"安全");
    }
}
