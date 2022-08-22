package com.totoro.behavioral.memento;

import java.util.Random;

/**
 * @author:totoro
 * @createDate:2022/8/22
 * @description:
 */
public class Student {
    private String currentWork;
    private int percentage;

    public void work(String currentWork){
        this.currentWork = currentWork;
        this.percentage = new Random().nextInt(100);
    }

    public State save(){
        return new State(currentWork,percentage);
    }


    public void restore(State state){
        this.currentWork = state.currentWork;
        this.percentage = state.percentage;
    }


    @Override
    public String toString() {
        return "我现在正在做："+currentWork+"进度："+percentage;
    }
}
