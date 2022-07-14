package com.justimagine.template;

/**
 * @Description TODO
 * @Date 2022/7/14 16:00
 * @Created by zhushuxian
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
