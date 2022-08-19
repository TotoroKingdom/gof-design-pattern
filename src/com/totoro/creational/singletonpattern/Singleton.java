package com.totoro.creational.singletonpattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Singleton {
    private final static Singleton INSTANCE = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return INSTANCE;
    }
}
