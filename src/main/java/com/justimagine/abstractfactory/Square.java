package com.justimagine.abstractfactory;

/**
 * @Description TODO
 * @Date 2022/7/12 11:22
 * @Created by zhushuxian
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}