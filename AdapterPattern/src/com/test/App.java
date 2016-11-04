package com.test;

/**
 * Created by developer on 2016/11/4.
 */
public class App {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.setEnergyAdapter(new UsToChinaEnergyAdapter());
        phone.charge();
    }
}
