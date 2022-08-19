package com.totoro.structural.bridge.example1;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public abstract class AbstractTea {

    protected Size size;

    protected AbstractTea(Size size){
        this.size = size;
    }

    public abstract String getType();
}
