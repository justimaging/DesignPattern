package com.justimagine.facade;

/**
 * @Description TODO
 * @Date 2022/7/13 9:43
 * @Created by zhushuxian
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
