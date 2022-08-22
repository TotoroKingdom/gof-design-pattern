package com.totoro.behavioral.visitor;

/**
 * @author:totoro
 * @createDate:2022/8/22
 * @description:
 */
public class Boss implements Visitor{
    @Override
    public void visit(Prize prize) {
        System.out.println("你的奖项大不大");
        System.out.println("快去996");
    }
}
