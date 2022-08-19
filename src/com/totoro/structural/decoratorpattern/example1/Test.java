package com.totoro.structural.decoratorpattern.example1;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        BaseImpl base = new BaseImpl();
        Decorator decorator = new Decorator(base);
        Decorator outer = new DecoratorImpl(decorator);

        decorator.test();
        outer.test();

    }
}
