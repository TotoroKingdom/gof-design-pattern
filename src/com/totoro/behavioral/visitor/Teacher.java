package com.totoro.behavioral.visitor;

/**
 * @author:totoro
 * @createDate:2022/8/22
 * @description:
 */
public class Teacher implements Visitor{
    @Override
    public void visit(Prize prize) {
        System.out.println("你是什么奖="+prize.getName());
        System.out.println("你是几等奖="+prize.getLevel());
    }
}
