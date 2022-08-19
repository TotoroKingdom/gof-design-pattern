package com.totoro.structural.decoratorpattern.example2;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        ICoffee coffee = new OriginalICoffee();
        coffee.makeCoffee();
        coffee = new MilkDecorator(coffee);
        coffee.makeCoffee();

        coffee = new SugarDecorator(coffee);
        coffee.makeCoffee();
    }
}
