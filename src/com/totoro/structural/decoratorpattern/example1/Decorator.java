package com.totoro.structural.decoratorpattern.example1;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Decorator extends Base{

    protected Base base;
    public Decorator(Base base){
        this.base = base;
    }

    @Override
    public void test() {
        base.test();
    }
}
