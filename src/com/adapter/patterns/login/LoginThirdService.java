package com.adapter.patterns.login;

import com.adapter.patterns.ResultMsg;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/20 18:09
 */
public class LoginThirdService extends LoginService{

    public ResultMsg loginQQ(String openId){
        return super.login(openId,null);
    }

}
