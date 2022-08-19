package com.totoro.creational.abstractfactorypattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public abstract class AbstractFactory {

    public abstract Phone getPhone();

    public abstract Table getTable();

    public abstract Router getRouter();

}
