package com.justimagine.strategy;

/**
 * @Description TODO
 * @Date 2022/7/14 15:35
 * @Created by zhushuxian
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
