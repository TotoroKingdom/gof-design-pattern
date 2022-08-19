package com.totoro.structural.facadepattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Test {
    public static void main(String[] args) {

        FacadeClient facadeClient = new FacadeClient();
        facadeClient.printReport();
    }
}
