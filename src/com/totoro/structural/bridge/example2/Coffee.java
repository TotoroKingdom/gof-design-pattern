package com.totoro.structural.bridge.example2;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public abstract class Coffee {
    protected ICoffeeAdditives additives;

    public Coffee(ICoffeeAdditives additives){
        this.additives = additives;
    }

    public abstract void orderCoffee(int count);
}
