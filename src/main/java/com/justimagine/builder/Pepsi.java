package com.justimagine.builder;

/**
 * @Description TODO
 * @Date 2022/7/12 14:11
 * @Created by zhushuxian
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}