package com.totoro.structural.proxypattern.example1;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Subject1Impl implements Subject1 {
    @Override
    public void test() {
        System.out.println("动态代理测试");
    }
}
