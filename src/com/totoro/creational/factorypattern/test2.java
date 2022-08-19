package com.totoro.creational.factorypattern;

import java.util.function.Supplier;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class test2 {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        Apple fruit = appleFactory.getFruit();
        test(fruit);
        test1(new AppleFactory()::getFruit);

        Orange fruit1 = new OrangeFactory().getFruit();
        test(fruit1);
        test1(new OrangeFactory()::getFruit);


    }

    private static void test(Fruit fruit){
        System.out.println(fruit+"被吃了");
    }

    private static void test1(Supplier<Fruit> supplier){
        System.out.println(supplier.get()+"真好吃");
    }
}
