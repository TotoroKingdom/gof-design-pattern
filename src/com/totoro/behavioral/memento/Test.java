package com.totoro.behavioral.memento;

/**
 * @author:totoro
 * @createDate:2022/8/22
 * @description:
 */
public class Test {
    public static void main(String[] args) {

        Student student = new Student();
        student.work("搬砖");
        System.out.println(student);

        State save = student.save();
        student.work("打电话");
        System.out.println(student);

        student.restore(save);
        System.out.println(student);
    }
}
