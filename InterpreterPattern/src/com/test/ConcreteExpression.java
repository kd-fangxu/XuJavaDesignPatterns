package com.test;

/**
 * Created by developer on 2016/11/8.
 */
public class ConcreteExpression extends  AbsExpression {//具体的解释器
    @Override
    public void interpret(Context context) {//解析容器中的内容
        System.out.println(context.getContent());
    }
}
