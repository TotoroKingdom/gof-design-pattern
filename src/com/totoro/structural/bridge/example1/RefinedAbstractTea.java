package com.totoro.structural.bridge.example1;

/**
 *@author:totoro
 *@createDate:2022/8/19
 *@description:
 */
public class RefinedAbstractTea extends AbstractTea{

    protected RefinedAbstractTea(Size size) {
        super(size);
    }

    @Override
    public String getType() {
        return null;
    }

    public String getSize() {
        return size.getSize();
    }
}