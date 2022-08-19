package com.totoro.creational.factorypattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public abstract class Fruit {
    private final String name;

    public Fruit(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return name + "@" + hashCode();
    }
}
