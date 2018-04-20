package com.adapter.patterns;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/20 18:00
 */
public class ResultMsg {

    private int code;

    private String message;

    private Object data;

    public ResultMsg(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultMsg{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
