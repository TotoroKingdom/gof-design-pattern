package com.totoro.behavioral.commandpattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        Controller.call(new OpenCommand(airConditioner));
    }
}
