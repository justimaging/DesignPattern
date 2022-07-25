package com.justimagine.others.compositeentity;

/**
 * @Description TODO
 * @Date 2022/7/25 9:42
 * @Created by zhushuxian
 */
public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData(){
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }

    public void setData(String data1, String data2){
        compositeEntity.setData(data1, data2);
    }
}