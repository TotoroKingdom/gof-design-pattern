package com.totoro.structural.decoratorpattern.example2;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public abstract class CoffeeDecorator implements ICoffee{

    private ICoffee coffee;

    public CoffeeDecorator(ICoffee coffee){
        this.coffee = coffee;
    }

    @Override
    public void makeCoffee() {
        coffee.makeCoffee();
    }
}
