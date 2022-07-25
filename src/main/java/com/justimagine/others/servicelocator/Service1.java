package com.justimagine.others.servicelocator;

/**
 * @Description TODO
 * @Date 2022/7/25 11:26
 * @Created by zhushuxian
 */
public class Service1 implements Service {
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}