package com.justimagine.nullobject;

/**
 * @Description TODO
 * @Date 2022/7/14 15:28
 * @Created by zhushuxian
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
