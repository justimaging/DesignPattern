package com.justimagine.command;

import java.util.ArrayList;
import java.util.List;
/**
 * @Description TODO
 * @Date 2022/7/13 13:01
 * @Created by zhushuxian
 */

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
