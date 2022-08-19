package com.totoro.structural.bridge.example2;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class test {
    public static void main(String[] args) {

        LargeCoffee largeCoffee = new LargeCoffee(new Milk());
        largeCoffee.orderCoffee(1);
//        largeCoffee.checkQuality();

    }
}
