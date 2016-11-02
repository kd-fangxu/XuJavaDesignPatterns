package com.test;

/**
 * Created by developer on 2016/11/2.
 */
public class App {
    public static void main(String[] args) {
        Builder build = new ConcreteBuilder();
        build.buildWeapon();
        build.buildWing();
        build.getRobot().run();
    }
}
