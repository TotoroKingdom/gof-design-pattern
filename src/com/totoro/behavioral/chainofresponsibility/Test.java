package com.totoro.behavioral.chainofresponsibility;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Test {
    public static void main(String[] args) {

        Handler handler = new FirstHandler();
        handler.connect(new SecondHandler()).connect(new ThirdHandler());
        handler.handle();
    }
}
