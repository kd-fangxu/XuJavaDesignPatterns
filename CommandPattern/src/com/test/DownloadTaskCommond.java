package com.test;

/**
 * Created by developer on 2016/11/4.
 */
public class DownloadTaskCommond extends TaskCommond {
    @Override
    public void doTask() {
        this.getTaskOperator().doTask(this);
    }
}
