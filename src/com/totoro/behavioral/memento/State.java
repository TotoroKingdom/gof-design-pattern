package com.totoro.behavioral.memento;

/**
 * @author:totoro
 * @createDate:2022/8/22
 * @description:
 */
public class State {
    final String currentWork;
    final int percentage;


    public State(String currentWork, int percentage) {
        this.currentWork = currentWork;
        this.percentage = percentage;
    }


}
