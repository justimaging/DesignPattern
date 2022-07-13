package com.justimagine.chainofresponsibility;

/**
 * @Description TODO
 * @Date 2022/7/13 12:54
 * @Created by zhushuxian
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
