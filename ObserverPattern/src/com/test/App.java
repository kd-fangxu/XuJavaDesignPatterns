package com.test;

/**
 * Created by developer on 2016/11/2.
 */
public class App {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.setName("陈老师");
        for (int i = 0; i < 10; i++) {
            Student student=new Student(teacher);
            student.setName("学生"+i);
            teacher.Attach(student);
        }
        teacher.setPhoneNumber("110");
        teacher.publishAll();
    }
}
