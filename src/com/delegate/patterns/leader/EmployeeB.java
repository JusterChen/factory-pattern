package com.delegate.patterns.leader;

/**
 * @Author: JiangChen
 * @Description:员工B
 * @Date 2018/4/20 16:54
 */
public class EmployeeB implements EmployeeMethos{

    @Override
    public void doing(String doMessage) {
        System.out.println("解密"+doMessage);
    }
}
