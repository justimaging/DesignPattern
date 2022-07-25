package com.justimagine.others.filter;

/**
 * @Description TODO
 * @Date 2022/7/25 10:41
 * @Created by zhushuxian
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
