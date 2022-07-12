package com.justimagine.builder;

/**
 * @Description TODO
 * @Date 2022/7/12 14:10
 * @Created by zhushuxian
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
