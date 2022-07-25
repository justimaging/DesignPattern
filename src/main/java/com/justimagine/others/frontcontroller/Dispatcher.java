package com.justimagine.others.frontcontroller;

/**
 * @Description TODO
 * @Date 2022/7/25 10:01
 * @Created by zhushuxian
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}