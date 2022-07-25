package com.justimagine.others.filter;

/**
 * @Description TODO
 * @Date 2022/7/25 10:21
 * @Created by zhushuxian
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
