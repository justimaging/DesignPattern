package com.justimagine.mediator;

/**
 * @Description TODO
 * @Date 2022/7/13 17:43
 * @Created by zhushuxian
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
