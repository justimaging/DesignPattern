package com.justimagine.abstractfactory;

/**
 * @Description TODO
 * @Date 2022/7/12 12:46
 * @Created by zhushuxian
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
