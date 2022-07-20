package com.justimagine.others.businessdelegate;

/**
 * @Description TODO
 * @Date 2022/7/20 17:32
 * @Created by zhushuxian
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
