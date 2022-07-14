package com.justimagine.memento;

/**
 * @Description TODO
 * @Date 2022/7/14 10:04
 * @Created by zhushuxian
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
