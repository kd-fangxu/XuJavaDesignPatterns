package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by developer on 2016/11/4.
 */
public class Banji {
    List<Student> studentList=new ArrayList<Student>();
    public void initStudent(){
        for (int i = 0; i < 30; i++) {
            Student student=new Student();
            student.setName("学生"+i);
            studentList.add(student);
        }

    }

    Iterator<Student> iterator=new Iterator<Student>() {
        int cursorPosition=0;
        @Override
        public boolean hasNext() {
            return  cursorPosition<studentList.size();
        }

        @Override
        public Student next() {
            Student student=studentList.get(cursorPosition);
            cursorPosition++;
            return student;
        }
    };
}
