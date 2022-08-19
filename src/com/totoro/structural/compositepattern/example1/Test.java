package com.totoro.structural.compositepattern.example1;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Directory outer = new Directory();
        Directory inner = new Directory();
        outer.addComponent(inner);
        outer.addComponent(new File());
        inner.addComponent(new File());
        inner.addComponent(new File());
        outer.test();
    }
}
