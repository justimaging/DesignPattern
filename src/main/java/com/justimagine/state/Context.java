package com.justimagine.state;

/**
 * @Description TODO
 * @Date 2022/7/14 15:23
 * @Created by zhushuxian
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
