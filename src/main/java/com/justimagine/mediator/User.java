package com.justimagine.mediator;

/**
 * @Description TODO
 * @Date 2022/7/13 17:42
 * @Created by zhushuxian
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
