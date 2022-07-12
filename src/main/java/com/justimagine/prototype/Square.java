package com.justimagine.prototype;

/**
 * @Description TODO
 * @Date 2022/7/12 18:06
 * @Created by zhushuxian
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}