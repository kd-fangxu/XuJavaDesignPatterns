package com.test;

/**
 * Created by developer on 2016/11/8.
 */
public class AppMedia {//app 中介

    public String getNewsList(){
        return new NewsModel().getNewList();
    }
}
