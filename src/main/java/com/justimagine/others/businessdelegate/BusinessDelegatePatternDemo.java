package com.justimagine.others.businessdelegate;

/**
 * @Description TODO
 * @Date 2022/7/20 17:32
 * @Created by zhushuxian
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
