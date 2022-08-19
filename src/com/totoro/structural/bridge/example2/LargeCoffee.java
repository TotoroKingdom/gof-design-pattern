package com.totoro.structural.bridge.example2;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class LargeCoffee extends RefinedCoffee{

    public LargeCoffee(ICoffeeAdditives additives) {
        super(additives);
    }

    @Override
    public void orderCoffee(int count) {
        additives.addSomething();
        System.out.println("大杯");
    }
}
