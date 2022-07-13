package com.justimagine.command;

/**
 * @Description TODO
 * @Date 2022/7/13 13:01
 * @Created by zhushuxian
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
