package test;

/**
 * Created by developer on 2016/11/4.
 */
public class App {


    public static void main(String[] args) {
        TaskSchuduler taskSchuduler=new TaskSchuduler();
        TaskOperator operator=new TaskOperator();
        DownloadTaskCommond taskCommond=new DownloadTaskCommond();
        taskCommond.setDownloadUrl("www.sogou.com.bmvb");
        taskCommond.setTaskOperator(operator);

        taskSchuduler.addCommand(taskCommond);
        taskSchuduler.addCommand(taskCommond);
        taskSchuduler.addCommand(taskCommond);
        taskSchuduler.addCommand(taskCommond);
        taskSchuduler.addCommand(taskCommond);
        taskSchuduler.addCommand(taskCommond);
        taskSchuduler.doTask();
    }

}
