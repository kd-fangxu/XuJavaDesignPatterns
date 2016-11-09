package com.test;

/**
 * Created by developer on 2016/11/8.
 */
public class ConcreteEle  extends  Element  {
    @Override
    public void Accept(Visitor visitor) {
        visitor.onVisitEle(this);
    }
}
