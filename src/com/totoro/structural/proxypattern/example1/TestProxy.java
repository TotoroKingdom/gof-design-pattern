package com.totoro.structural.proxypattern.example1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class TestProxy implements InvocationHandler {

    private final Object object;

    public TestProxy(Object o){
        this.object = o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理的对象："+proxy.getClass());
        Object invoke = method.invoke(object, args);
        System.out.println("方法调用完成，返回："+invoke);
        return invoke;
    }
}
