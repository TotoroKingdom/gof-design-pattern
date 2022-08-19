package com.totoro.structural.bridge.example1;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Test {
    public static void main(String[] args) {

        KissTea tea = new KissTea(new Large());
        System.out.println(tea.getType());
        System.out.println(tea.getSize());
    }
}
