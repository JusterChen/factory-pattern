package com.strategy.patterns;

/**
 * @Author: JiangChen
 * @Description:出行结果
 * @Date 2018/4/20 15:01
 */
public class TravelResult {

    private int hour;

    private String message;

    public TravelResult(int hour, String message) {
        this.hour = hour;
        this.message = message;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "此次出行的结果花了"+ hour +
                "小时，最终" + message + "到达无锡";
    }
}
