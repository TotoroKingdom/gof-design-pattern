package com.totoro.structural.flyweightpattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class DBUtilFactory {
    private static final DBUtil UTIL = new DBUtil();

    public static DBUtil getUTIL() {
        return UTIL;
    }
}
