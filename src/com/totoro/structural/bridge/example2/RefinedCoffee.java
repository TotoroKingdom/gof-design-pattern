package com.totoro.structural.bridge.example2;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public abstract class RefinedCoffee extends Coffee{
    
    public RefinedCoffee(ICoffeeAdditives additives) {
        super(additives);
    }

    public void checkQuality(){
        System.out.println("品控");
    }
}
