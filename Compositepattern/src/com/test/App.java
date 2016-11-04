package com.test;

import java.util.Iterator;

/**
 * Created by developer on 2016/11/4.
 */
public class App {
    public static void main(String[] args) {
        StudyGroup studyGroup=new StudyGroup();
        studyGroup.setName("学习小组1");
        Student student=new Student();
        student.setName("刘1");
        Student student2=new Student();
        student2.setName("刘2");
        studyGroup.addSubOb(student);
        studyGroup.addSubOb(student2);

        studyGroup.jiaozZuoYe();
    }
}
