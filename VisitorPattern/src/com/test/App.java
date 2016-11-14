package com.test;

/**
 * Created by developer on 2016/11/8.
 */
public class App
{
    public static void main(String[] args) {
      ConcreteEle concreteEle=new ConcreteEle();
        ObjectVisitStructure objectVisitStructure=new ObjectVisitStructure();
        objectVisitStructure.addElement(concreteEle);
        objectVisitStructure.addElement(concreteEle);
        Visitor visitor=new Visitor();
        objectVisitStructure.visit(visitor);
    }
}
