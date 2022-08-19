package com.totoro.structural.decoratorpattern.example1;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class DecoratorImpl extends Decorator{
    public DecoratorImpl(Base base) {
        super(base);
    }

    @Override
    public void test() {
        System.out.println("操作前");
        super.test();
        System.out.println("操作后");
    }


}
