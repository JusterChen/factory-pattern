package com.delegate.patterns.leader;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: JiangChen
 * @Description:经理
 * @Date 2018/4/20 16:58
 */
public class Leader implements EmployeeMethos{

    private Map<String,EmployeeMethos> map = new HashMap<String,EmployeeMethos>();

    public Leader() {
        map.put("加密",new EmployeeA());
        map.put("解密",new EmployeeB());
    }

    @Override
    public void doing(String doMessage) {
       map.get(doMessage).doing(doMessage);
    }
}
