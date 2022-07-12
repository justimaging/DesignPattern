package com.justimagine.decorator;

/**
 * @Description TODO
 * @date 2022/7/12 23:40
 * @created by zhushuxian
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
