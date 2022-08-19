package com.totoro.structural.proxypattern.example1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Subject1Impl subject = new Subject1Impl();
        InvocationHandler handler = new TestProxy(subject);

        Subject1 o = (Subject1) Proxy.newProxyInstance(
                subject.getClass().getClassLoader()
                , subject.getClass().getInterfaces()
                , handler);
        o.test();
    }
}
