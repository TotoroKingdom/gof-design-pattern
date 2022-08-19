package com.totoro.behavioral.commandpattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public abstract class Command {
    private final Receiver receiver;

    protected Command(Receiver receiver){
        this.receiver = receiver;
    }

    public void execute(){
        receiver.action();
    }
}
