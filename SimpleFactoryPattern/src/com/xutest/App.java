package com.xutest;

/**
 * Created by developer on 2016/10/12.
 */
public class App {
    public static void main(String[] args) {
        CarFactory.makeCar("AudiA1","白色").run();
        CarFactory.makeCar("AudiA3","褐色").run();
        System.out.print("this is a test");
    }

}
