package com.totoro.creational.factorypattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class test1 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple);
        Orange orange = new Orange();
        System.out.println(orange);

        Fruit fruit = FruitFactory.getFruit("苹果");
        Fruit f = FruitFactory.getFruit("橘子");
        System.out.println(f);
        System.out.println(fruit);

    }
}
