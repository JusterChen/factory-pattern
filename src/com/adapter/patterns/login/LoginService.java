package com.adapter.patterns.login;

import com.adapter.patterns.Member;
import com.adapter.patterns.ResultMsg;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/20 18:07
 */
public class LoginService {

    ResultMsg login(String username, String password){
        return new ResultMsg(200,"登录成功",new Member());
    }
}
