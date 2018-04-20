package com.strategy.patterns;


import com.strategy.patterns.travel.Car;
import com.strategy.patterns.travel.Plane;
import com.strategy.patterns.travel.Trip;
import com.strategy.patterns.travel.Walk;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/20 15:16
 */
public enum SelectTripType {
    CAR_TYPE(new Car()),
    PLAN_TYPE(new Plane()),
    WALK_TYPE(new Walk());

    private Trip trip;
    SelectTripType(Trip trip){
        this.trip = trip;
    }

    public Trip get(){
        return this.trip;
    }
}
