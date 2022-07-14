package com.justimagine.observer;

/**
 * @Description TODO
 * @Date 2022/7/14 13:05
 * @Created by zhushuxian
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
