package com.totoro.creational.factorypattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class FruitFactory {
    public static Fruit getFruit(String type){
        switch (type){
            case "苹果":
                return new Apple();
            case "橘子":
                return new Orange();
            default:
                return null;
        }
    }
}
