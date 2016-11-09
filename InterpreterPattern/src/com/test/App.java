package com.test;

/**
 * Created by developer on 2016/11/8.
 */
public class App {
    public static void main(String[] args) {
        Context context=new Context();
        context.setContent("this is a test");
        AbsExpression expression=new ConcreteExpression();
        expression.interpret(context);
    }
}
