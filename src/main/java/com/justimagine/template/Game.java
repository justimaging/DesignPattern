package com.justimagine.template;

/**
 * @Description TODO
 * @Date 2022/7/14 15:38
 * @Created by zhushuxian
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
