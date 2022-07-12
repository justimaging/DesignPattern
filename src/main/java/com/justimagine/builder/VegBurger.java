package com.justimagine.builder;

/**
 * @Description TODO
 * @Date 2022/7/12 14:10
 * @Created by zhushuxian
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}