package com.justimagine.decorator;

/**
 * @Description TODO
 * @date 2022/7/12 23:40
 * @created by zhushuxian
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
