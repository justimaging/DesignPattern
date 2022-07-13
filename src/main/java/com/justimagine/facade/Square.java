package com.justimagine.facade;

/**
 * @Description TODO
 * @Date 2022/7/13 9:42
 * @Created by zhushuxian
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}