package com.totoro.behavioral.state;

/**
 * @author:totoro
 * @createDate:2022/8/22
 * @description:
 */
public class Test {
    public static void main(String[] args) {

        Student student = new Student();
        student.setState(State.NORMAL);
        student.study();
        student.setState(State.LAZY);
        student.study();
    }
}
