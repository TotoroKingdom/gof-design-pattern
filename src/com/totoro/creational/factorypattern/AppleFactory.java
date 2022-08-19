package com.totoro.creational.factorypattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class AppleFactory extends FruitSimpleFactory<Apple> {
    @Override
    public Apple getFruit() {
        return new Apple();
    }
}
