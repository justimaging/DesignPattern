package com.justimagine.others.compositeentity;

/**
 * @Description TODO
 * @Date 2022/7/25 9:49
 * @Created by zhushuxian
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}