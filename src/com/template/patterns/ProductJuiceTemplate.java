package com.template.patterns;

/**
 * @Author: JiangChen
 * @Description:生产果汁的模板
 * @Date 2018/4/20 16:07
 */
public class ProductJuiceTemplate {

    private void getMaterial(String fruit){
        System.out.println("投入的原料是：" + fruit);
    }

    private void getSugar(int sugarNumber){
        System.out.println("投入糖的数量是：" + sugarNumber);
    }

    private void getWater(int waterNumber){
        System.out.println("加入的水是：" + waterNumber + "L");
    }

    public void getFruitJuice(String fruit, int sugarNumber, int waterNumber){
        getMaterial(fruit);
        getSugar(sugarNumber);
        getWater(waterNumber);
        System.out.println("生成了一瓶"+fruit+"汁");
    }


}
