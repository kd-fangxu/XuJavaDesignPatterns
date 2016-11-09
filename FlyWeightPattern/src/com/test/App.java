package com.test;

/**
 * Created by developer on 2016/11/8.
 */
public class App {
    public static void main(String[] args) {
        FlyWeightFactory flyWeightFactory=new FlyWeightFactory();
        flyWeightFactory.getObByKey("1");
        flyWeightFactory.getObByKey("2");
    }
}
