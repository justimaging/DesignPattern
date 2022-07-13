package com.justimagine.proxy;

/**
 * @Description TODO
 * @Date 2022/7/13 10:27
 * @Created by zhushuxian
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
