package com.totoro.structural.flyweightpattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class UserService {
    public void service(){
        DBUtil util = DBUtilFactory.getUTIL();
        util.selectDB();
    }
}
