package com.adapter.patterns;

import com.adapter.patterns.login.LoginThirdService;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/20 17:59
 */
public class Test {

    public static void main(String[] args) {
        LoginThirdService loginThirdService = new LoginThirdService();
        System.out.println(loginThirdService.loginQQ("swee123"));
    }
}
