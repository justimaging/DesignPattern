package com.justimagine.abstractfactory;

/**
 * @Description TODO
 * @Date 2022/7/12 12:46
 * @Created by zhushuxian
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
