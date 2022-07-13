package com.justimagine.mediator;

/**
 * @Description TODO
 * @Date 2022/7/13 17:42
 * @Created by zhushuxian
 */
import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
