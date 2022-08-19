package com.totoro.structural.compositepattern.example1;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public abstract class Component {

    public abstract void addComponent(Component component);
    public abstract void removeComponent(Component component);
    public abstract Component getChild(int index);
    public abstract void test();

}
