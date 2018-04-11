package com.prototype.patterns.deepClone;

import java.io.Serializable;

/**
 * @Author: JiangChen
 * @Description:金箍棒
 * @Date 2018/4/11 17:21
 */
public class Bang implements Serializable{

    public int height = 10;

    public void getBig(){
        this.height += 10;
    }

    public void getSmall(){
        this.height -=2;
    }
}
