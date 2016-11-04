package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 任务调度这
 * Created by developer on 2016/11/4.
 */
public class TaskSchuduler {
    List<TaskCommond> commondList=new ArrayList<TaskCommond>();
    public void addCommand(TaskCommond commond){
        commondList.add(commond);
    }
    public void removeCommand(TaskCommond commond){
        commondList.remove(commond);
    }

    public void doTask(){
        for (TaskCommond command : commondList){
            command.doTask();
        }
    }
}
