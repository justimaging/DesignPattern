package com.justimagine.builder;

/**
 * @Description TODO
 * @Date 2022/7/12 14:10
 * @Created by zhushuxian
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
