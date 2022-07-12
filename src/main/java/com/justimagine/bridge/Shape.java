package com.justimagine.bridge;

/**
 * @Description TODO
 * @date 2022/7/12 22:42
 * @created by zhushuxian
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
