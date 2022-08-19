package com.totoro.structural.decoratorpattern.example2;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class OriginalICoffee implements ICoffee {
    @Override
    public void makeCoffee() {
        System.out.println("原味咖啡 ");
    }
}
