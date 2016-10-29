package com.test;

/**
 * Created by developer on 2016/10/12.
 */
public class AudiCarMakeStrategyImp implements IcarMakeStrategy{
    @Override
    public void makeCar(String name, String color) {
        System.out.println("audi 生产"+color+"的"+name);
    }
}
