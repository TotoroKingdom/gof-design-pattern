package com.totoro.structural.bridge.example1;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Large implements Size{
    @Override
    public String getSize() {
        return "大杯";
    }
}
