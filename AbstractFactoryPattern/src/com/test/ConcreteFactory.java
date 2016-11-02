package com.test;

/**
 * Created by developer on 2016/11/2.
 */
public class ConcreteFactory implements  IFactory {
    @Override
    public Iworker getWorker() {
        return new ConcreteWorker();
    }

    @Override
    public Idepartment getDepartment() {
        return new ConcreteDepartment();
    }
}
