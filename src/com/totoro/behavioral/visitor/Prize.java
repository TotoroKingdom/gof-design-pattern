package com.totoro.behavioral.visitor;

/**
 * @author:totoro
 * @createDate:2022/8/22
 * @description:
 */
public class Prize {
    String name;
    String level;

    public Prize(String name, String level){
        this.name = name;
        this.level= level;
    }

    public String getName(){
        return name;
    }

    public String getLevel(){
        return level;
    }
}
