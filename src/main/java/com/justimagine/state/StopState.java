package com.justimagine.state;

/**
 * @Description TODO
 * @Date 2022/7/14 15:23
 * @Created by zhushuxian
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}