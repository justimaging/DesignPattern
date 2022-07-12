package com.justimagine.prototype;

/**
 * @Description TODO
 * @Date 2022/7/12 18:06
 * @Created by zhushuxian
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}