package com.totoro.structural.adapterpattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class ObjectAdapter implements Target{
    PhoneSupplier supplier;

    public ObjectAdapter(PhoneSupplier supplier){
        this.supplier = supplier;
    }

    @Override
    public String supply() {
        return supplier.doSupply();
    }
}
