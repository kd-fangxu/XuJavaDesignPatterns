package com.test;

/**
 * Created by developer on 2016/11/2.
 */
public class App {
    public static void main(String[] args) {
        IFactory iFactory=new ConcreteFactory();
        iFactory.getWorker().doWork();;
        iFactory.getDepartment().doDepartmentWork();
    }

//    根据不同的Ifactory实现类 实现不同的方法策略  当有新的工厂时  新建工厂实现类  符合开放封闭原则
//    优化  新建一个调度类 根据不同的参数 组合 不同的工厂实现类  也可根据参数反射不同的工厂类
}
