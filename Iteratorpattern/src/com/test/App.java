package com.test;

/**
 * Created by developer on 2016/11/4.
 */
public class App {
    public static void main(String[] args) {
        Banji banji=new Banji();
        banji.initStudent();
        while (banji.iterator.hasNext()){
            System.out.println(banji.iterator.next().toString());

        }
    }
}
