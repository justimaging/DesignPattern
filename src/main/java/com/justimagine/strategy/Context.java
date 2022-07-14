package com.justimagine.strategy;

/**
 * @Description TODO
 * @Date 2022/7/14 15:36
 * @Created by zhushuxian
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
