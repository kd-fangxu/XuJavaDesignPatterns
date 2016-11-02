package com.test;

/**
 * Created by developer on 2016/11/2.
 */
public class ConcreteWorker implements Iworker {
    @Override
    public void doWork() {
        System.out.println("工人苦逼干活");
    }
}
