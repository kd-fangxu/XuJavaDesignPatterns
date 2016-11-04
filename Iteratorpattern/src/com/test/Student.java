package com.test;

/**
 * Created by developer on 2016/11/4.
 */
public class Student {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
