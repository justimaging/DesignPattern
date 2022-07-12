package com.justimagine.bridge;

/**
 * @Description TODO
 * @date 2022/7/12 22:41
 * @created by zhushuxian
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
