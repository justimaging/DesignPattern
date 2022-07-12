package com.justimagine.bridge;

/**
 * @Description TODO
 * @date 2022/7/12 22:43
 * @created by zhushuxian
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
