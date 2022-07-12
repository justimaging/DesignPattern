package com.justimagine.abstractfactory;

/**
 * @Description TODO
 * @Date 2022/7/12 11:22
 * @Created by zhushuxian
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
