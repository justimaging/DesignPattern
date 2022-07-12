package com.justimagine.builder;

/**
 * @Description TODO
 * @Date 2022/7/12 14:10
 * @Created by zhushuxian
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
