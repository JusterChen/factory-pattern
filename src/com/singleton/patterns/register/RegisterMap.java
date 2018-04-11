package com.singleton.patterns.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: JiangChen
 * @Description: 单例注册登记式
 * @Date 2018/4/11 18:06
 */
public class RegisterMap {

    private RegisterMap(){

    }

    private static Map<String,Object> map = new ConcurrentHashMap<>();

    public synchronized static Object getBean(String className){

        if(!map.containsKey(className)){
            Object object = null;
            try {
                object = Class.forName(className).newInstance();
                map.put(className,object);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return object;
        }else{
            return map.get(className);
        }
    }

}
