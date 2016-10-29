package com.test;

/**
 * Created by developer on 2016/10/12.
 */
public class App {
    public static void main(String[] args) {
        CarMakeStrategySchuduler schuduler = new CarMakeStrategySchuduler();
        schuduler.setIcarMakeStrategy(new AudiCarMakeStrategyImp());
        schuduler.doMakeCar();
        schuduler.setIcarMakeStrategy(new BenzCarMakeStrategyImp());
        schuduler.doMakeCar();
    }
}
