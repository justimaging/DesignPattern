package com.justimagine.nullobject;

/**
 * @Description TODO
 * @Date 2022/7/14 15:28
 * @Created by zhushuxian
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}