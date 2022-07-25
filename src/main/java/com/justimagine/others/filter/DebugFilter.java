package com.justimagine.others.filter;

/**
 * @Description TODO
 * @Date 2022/7/25 10:22
 * @Created by zhushuxian
 */
public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
