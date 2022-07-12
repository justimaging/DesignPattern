package com.justimagine.prototype;

/**
 * @Description TODO
 * @Date 2022/7/12 18:07
 * @Created by zhushuxian
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
