package com.totoro.behavioral.observer;

/**
 * @author:totoro
 * @createDate:2022/8/22
 * @description:
 */
public class Test {
    public static void main(String[] args) {

        Subject subject = new Subject();
        subject.observe(() -> System.out.println("一号观察者"));
        subject.observe(() -> System.out.println("二号观察者"));
        subject.modify();
    }
}
