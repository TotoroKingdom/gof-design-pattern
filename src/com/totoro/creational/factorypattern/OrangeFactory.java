package com.totoro.creational.factorypattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class OrangeFactory extends FruitSimpleFactory<Orange> {
    @Override
    public Orange getFruit() {
        return new Orange();
    }
}
