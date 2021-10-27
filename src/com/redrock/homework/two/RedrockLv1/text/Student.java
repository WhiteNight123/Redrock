package com.redrock.homework.two.RedrockLv1.text;

public class Student {

    //学生做课堂练习,并告诉老师
    public void doPractice(BackInterface BackInterface) {
        System.out.println("学生做练习...");
        System.out.println("学生告诉老师做完练习...");
        BackInterface.backMethod();
    }
}