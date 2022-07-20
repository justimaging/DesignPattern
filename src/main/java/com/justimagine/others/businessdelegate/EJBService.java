package com.justimagine.others.businessdelegate;

/**
 * @Description TODO
 * @Date 2022/7/20 17:31
 * @Created by zhushuxian
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
