package com.totoro.structural.decoratorpattern.example2;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        System.out.println("加糖");
    }
}
