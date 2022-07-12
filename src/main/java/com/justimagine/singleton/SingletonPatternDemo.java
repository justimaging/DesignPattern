package com.justimagine.singleton;

import com.justimagine.singleton.demo6.Singleton;

/**
 * @Description TODO
 * @Date 2022/7/11 14:39
 * @Created by zhushuxian
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();

        com.justimagine.singleton.demo1.Singleton.getInstance().showMessage();
        Singleton.INSTANCE.showMessage();
    }
}
