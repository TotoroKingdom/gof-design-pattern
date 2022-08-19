package com.totoro.structural.proxypattern.example1;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class SubjectImpl extends Subject{
    @Override
    public void test() {
        System.out.println("我是测试方法");
    }
}
