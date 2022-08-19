package com.totoro.creational.prototypepattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Student implements Cloneable{
    String name;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.name = new String(name);
        return student;
    }
}
