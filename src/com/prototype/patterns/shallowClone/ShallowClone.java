package com.prototype.patterns.shallowClone;

/**
 * @Author: JiangChen
 * @Description:浅克隆
 * @Date 2018/4/11 17:05
 */
public class ShallowClone implements Cloneable{

    public String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
