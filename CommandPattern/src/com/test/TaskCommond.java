package com.test;

/**
 * 命令对象
 * Created by developer on 2016/11/4.
 */
public abstract class TaskCommond {
    String downloadUrl;
    TaskOperator taskOperator;
    public abstract void doTask();

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public TaskOperator getTaskOperator() {
        return taskOperator;
    }

    public void setTaskOperator(TaskOperator taskOperator) {
        this.taskOperator = taskOperator;
    }
}
