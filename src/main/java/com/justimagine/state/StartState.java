package com.justimagine.state;

/**
 * @Description TODO
 * @Date 2022/7/14 15:22
 * @Created by zhushuxian
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
