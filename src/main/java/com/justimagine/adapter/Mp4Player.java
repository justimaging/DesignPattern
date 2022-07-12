package com.justimagine.adapter;

/**
 * @Description TODO
 * @date 2022/7/12 22:26
 * @created by zhushuxian
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
