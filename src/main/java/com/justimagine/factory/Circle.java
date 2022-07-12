package com.justimagine.factory;

/**
 * @Description TODO
 * @Date 2022/7/12 11:23
 * @Created by zhushuxian
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}