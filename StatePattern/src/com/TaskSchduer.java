package com;

/**
 * Created by developer on 2016/11/3.
 */
public class TaskSchduer {
    BaseState state;
    public  void doStr(){
        if (state==null){
            state=new StateNoTask();
        }
        state.doNext(this);
    }

}
