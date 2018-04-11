package com.prototype.patterns.deepClone;

import java.io.*;
import java.util.Date;

/**
 * @Author: JiangChen
 * @Description:齐天大圣吹毫毛 深克隆
 * @Date 2018/4/11 17:22
 */
public class QiTianDaSheng extends Monkey implements Cloneable,Serializable{

    public Bang bang;

    public QiTianDaSheng(){
        this.time=new Date();
        this.bang = new Bang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //浅克隆
        //return super.clone();
        //深克隆
        return this.deepClone();
    }

    //序列话简单
    public Object deepClone(){
        Object object = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(byteArrayInputStream);
            QiTianDaSheng qiTianDaSheng = (QiTianDaSheng)oi.readObject();
            qiTianDaSheng.time = new Date();
            return qiTianDaSheng;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //这种方式麻烦
    public QiTianDaSheng copy(QiTianDaSheng target){
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.bang = new Bang();
        qiTianDaSheng.bang.height = target.bang.height;
        qiTianDaSheng.time = new Date();
        return qiTianDaSheng;
    }
}
