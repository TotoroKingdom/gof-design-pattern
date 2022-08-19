package com.totoro.behavioral.commandpattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Controller {
    public static void call(Command command){
        command.execute();
    }
}
