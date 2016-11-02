package com.test;

/**
 * Created by developer on 2016/11/2.
 */
public class ConcreteDepartment implements  Idepartment {
    @Override
    public void doDepartmentWork() {
        System.out.println("部门苦逼工作中");
    }
}
