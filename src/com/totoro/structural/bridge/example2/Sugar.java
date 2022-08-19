package com.totoro.structural.bridge.example2;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Sugar implements ICoffeeAdditives{
    @Override
    public void addSomething() {
        System.out.println("加糖");
    }
}
