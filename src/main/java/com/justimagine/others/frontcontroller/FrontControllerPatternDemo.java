package com.justimagine.others.frontcontroller;

/**
 * @Description TODO
 * @Date 2022/7/25 10:02
 * @Created by zhushuxian
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}