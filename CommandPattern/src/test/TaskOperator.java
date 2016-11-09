package test;

/**
 * 任务执行者
 * Created by developer on 2016/11/4.
 */
public class TaskOperator {
    public void doTask(TaskCommond commond){
        System.out.println("下载"+commond.getDownloadUrl());
    }
}
