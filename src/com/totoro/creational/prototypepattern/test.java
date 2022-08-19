package com.totoro.creational.prototypepattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class test {

    public static void main(String[] args) throws CloneNotSupportedException {
//        int a = 10;
//        int b = a;
//        System.out.println(a == b);
//        Object o = new Object();
//        Object j = o;
//        System.out.println(o == j);
        Student student = new Student("小明");
        Student clone = (Student) student.clone();
        System.out.println(student.getName() ==clone.getName());
        System.out.println(student.getName());
        System.out.println(clone.getName());


    }
}
