package com.justimagine.others.businessdelegate;

/**
 * @Description TODO
 * @Date 2022/7/20 17:32
 * @Created by zhushuxian
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
