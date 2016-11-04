package com;

import com.sun.xml.internal.rngom.parse.host.Base;

/**
 * Created by developer on 2016/11/3.
 */
public class StateWorking extends BaseState {

    @Override
    public void doNext(TaskSchduer schduer) {
        System.out.println("做了很多工作后  状态变为 finished");
        schduer.state=new StateFinished();
    }
}
