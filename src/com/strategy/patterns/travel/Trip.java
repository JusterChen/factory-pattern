package com.strategy.patterns.travel;


import com.strategy.patterns.TravelResult;

/**
 * @Author: JiangChen
 * @Description:出去旅游
 * @Date 2018/4/20 14:59
 */
public interface Trip {

    TravelResult play(int hour);
}
