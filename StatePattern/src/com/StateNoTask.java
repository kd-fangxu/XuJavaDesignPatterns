package com;

/**
 * Created by developer on 2016/11/3.
 */
public class StateNoTask  extends  BaseState{


    @Override
    public void doNext(TaskSchduer schduer) {
        System.out.println("载入工作 状态变为 woking");
        schduer.state=new StateWorking();
    }
}
