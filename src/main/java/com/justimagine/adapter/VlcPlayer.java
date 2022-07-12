package com.justimagine.adapter;

/**
 * @Description TODO
 * @date 2022/7/12 22:26
 * @created by zhushuxian
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}