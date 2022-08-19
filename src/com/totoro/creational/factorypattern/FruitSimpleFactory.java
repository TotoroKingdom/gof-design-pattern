package com.totoro.creational.factorypattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public abstract class FruitSimpleFactory<T extends Fruit> {
    public abstract T getFruit();
}
