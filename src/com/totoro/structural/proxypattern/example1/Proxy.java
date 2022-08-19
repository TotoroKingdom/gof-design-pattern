package com.totoro.structural.proxypattern.example1;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Proxy extends Subject{
    Subject target;

    public Proxy(Subject subject){
        this.target = subject;
    }

    @Override
    public void test() {
        System.out.println("代理前");
        target.test();
        System.out.println("代理后");
    }
}
