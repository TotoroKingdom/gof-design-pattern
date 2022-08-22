package com.totoro.behavioral.state;

/**
 * @author:totoro
 * @createDate:2022/8/22
 * @description:
 */
public class Student {
    private State state;

    public void setState(State state){
        this.state = state;
    }

    public void study(){
        switch (state){
            case LAZY:
                System.out.println("开摆");
                break;
            case NORMAL:
                System.out.println("拼搏白天，我要上北大");
                break;
        }
    }
}
