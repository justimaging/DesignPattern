package com.justimagine.command;

/**
 * @Description TODO
 * @Date 2022/7/13 12:59
 * @Created by zhushuxian
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+",quantity: " + quantity + "] sold");
    }
}
