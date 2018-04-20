package com.strategy.patterns;

/**
 * @Author: JiangChen
 * @Description:这个人计划多少时间
 * @Date 2018/4/20 15:23
 */
public class Person {

    private int hour;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Person(int hour) {
        this.hour = hour;
    }

    public TravelResult trip(SelectTripType selectTripType){
        return selectTripType.get().play(this.hour);
    }
}
