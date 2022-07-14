package com.justimagine.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Date 2022/7/14 10:05
 * @Created by zhushuxian
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}