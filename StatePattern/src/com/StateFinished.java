package com;

/**
 * Created by developer on 2016/11/3.
 */
public class StateFinished  extends  BaseState{


    @Override
    public void doNext(TaskSchduer schduer) {
        System.out.println("终于干完了");
        schduer.state=new StateNoTask();
    }
}
