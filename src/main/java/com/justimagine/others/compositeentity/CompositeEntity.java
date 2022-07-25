package com.justimagine.others.compositeentity;

/**
 * @Description TODO
 * @Date 2022/7/25 9:42
 * @Created by zhushuxian
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}