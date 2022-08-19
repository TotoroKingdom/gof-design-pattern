package com.totoro.structural.adapterpattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class PhoneAdapter extends PhoneSupplier implements Target{
    @Override
    public String supply() {
        return super.doSupply();
    }
}
