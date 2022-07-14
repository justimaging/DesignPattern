package com.justimagine.observer;

/**
 * @Description TODO
 * @Date 2022/7/14 13:05
 * @Created by zhushuxian
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
