package com.justimagine.observer;

/**
 * @Description TODO
 * @Date 2022/7/14 13:04
 * @Created by zhushuxian
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
