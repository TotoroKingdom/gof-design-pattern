package com.totoro.behavioral.commandpattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class AirConditioner implements Receiver{
    @Override
    public void action() {
        System.out.println("空调启动，起飞");
    }
}
