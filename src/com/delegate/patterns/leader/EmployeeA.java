package com.delegate.patterns.leader;

/**
 * @Author: JiangChen
 * @Description:员工A
 * @Date 2018/4/20 16:54
 */
public class EmployeeA implements EmployeeMethos{

    @Override
    public void doing(String doMessage) {
        System.out.println("加密"+doMessage);
    }
}
