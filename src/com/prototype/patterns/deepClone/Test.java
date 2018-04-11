package com.prototype.patterns.deepClone;

/**
 * @Author: JiangChen
 * @Description:
 * @Date 2018/4/11 17:21
 */
public class Test {

    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        QiTianDaSheng qiTianDaSheng1 = null;
        try {
            qiTianDaSheng1 = (QiTianDaSheng) qiTianDaSheng.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(qiTianDaSheng.bang);
        System.out.println(qiTianDaSheng1.bang);
        System.out.println(qiTianDaSheng.bang==qiTianDaSheng1.bang);

        /*QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        QiTianDaSheng qiTianDaSheng1 = qiTianDaSheng.copy(qiTianDaSheng);
        System.out.println(qiTianDaSheng==qiTianDaSheng1);
        System.out.println(qiTianDaSheng.bang==qiTianDaSheng1.bang);*/


    }
}
