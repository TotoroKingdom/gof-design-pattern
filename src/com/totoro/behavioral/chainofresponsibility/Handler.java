package com.totoro.behavioral.chainofresponsibility;

import java.util.Optional;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public abstract class Handler {
    protected Handler successor;

    public Handler connect(Handler successor){
        this.successor = successor;
        return successor;
    }

    public void handle(){
        this.doHandle();
        Optional.ofNullable(successor)
                .ifPresent(Handler::handle);
    }

    public abstract void doHandle();
}
