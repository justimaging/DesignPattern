package com.justimagine.builder;

/**
 * @Description TODO
 * @Date 2022/7/12 14:09
 * @Created by zhushuxian
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
