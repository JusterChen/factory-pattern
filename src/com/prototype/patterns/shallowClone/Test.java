package com.prototype.patterns.shallowClone;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/11 17:08
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowClone shallowClone = new ShallowClone();
        shallowClone.name = "jc";
        ShallowClone shallowClone1 = (ShallowClone) shallowClone.clone();
        System.out.println(shallowClone1.name);
    }

}
