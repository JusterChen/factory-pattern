package com.template.patterns;

/**
 * @Author: JiangChen
 * @Description:模板模式
 * @Date 2018/4/20 16:03
 */
public class Test {

    public static void main(String[] args) {
        ProductJuiceTemplate productJuiceTemplate = new ProductJuiceTemplate();
        productJuiceTemplate.getFruitJuice("苹果",1,3);
    }
}
