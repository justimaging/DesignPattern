package com.justimagine.observer;

/**
 * @Description TODO
 * @Date 2022/7/14 13:04
 * @Created by zhushuxian
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
