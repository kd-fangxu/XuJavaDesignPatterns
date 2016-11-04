package com.test;

/**
 * Created by developer on 2016/10/12.
 */
public class BenzCarMakeStrategyImp implements  IcarMakeStrategy {
    @Override
    public void makeCar(String name, String color) {
        System.out.println("Benz 生产"+color+"的"+name);
    }
}
